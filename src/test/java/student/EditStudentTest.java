package student;

import org.junit.jupiter.api.Test;
import ru_omsu_fctk_simpleserver.server.Reader;
import ru_omsu_fctk_simpleserver.server.Server;
import ru_omsu_fctk_simpleserver.server.Writer;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EditStudentTest {

    @Test
    void editStudentTest() throws Exception {
        Server server = new Server();

        Reader reader01 = new Reader("addStudentGroups::{\"name\":\"MMB-101\"}");
        server.executeRequest(reader01); // 1
        Reader reader02 = new Reader("addStudentGroups::{\"name\":\"MMB-102\"}");
        server.executeRequest(reader02); // 2

        Reader reader0 = new Reader("addStudent::{\"groupId\":\"1\",\"surname\":\"Носов\",\"name\":\"Никита\",\"patronymic\":\"Отчество\",\"status\":\"учится\"}");
        server.executeRequest(reader0); // 1

        Reader reader1 = new Reader("editStudent::{\"id\":\"1\",\"groupId\":\"2\",\"surname\":\"Носов\",\"name\":\"Никита\",\"patronymic\":\"Отчество\",\"status\":\"учится\"}");
        Writer writer1 = server.executeRequest(reader1);

        assertEquals(writer1.toString(), "200::");

        Reader reader10 = new Reader("getStudentById::{\"id\":\"1\"}");
        Writer writer10 = server.executeRequest(reader10);

        assertEquals(writer10.toString(), "200::{\"groupId\":2,\"surname\":\"Носов\",\"name\":\"Никита\",\"patronymic\":\"Отчество\",\"status\":\"учится\"}");

        Reader reader2 = new Reader("editStudent::{\"id\":\"1\",\"groupId\":\"2\",\"surname\":\"Щербаков\",\"name\":\"Никита\",\"patronymic\":\"Отчество\",\"status\":\"учится\"}");
        Writer writer2 = server.executeRequest(reader2);

        assertEquals(writer1.toString(), "200::");

        Reader reader20 = new Reader("getStudentById::{\"id\":\"1\"}");
        Writer writer20 = server.executeRequest(reader20);

        assertEquals(writer20.toString(), "200::{\"groupId\":2,\"surname\":\"Щербаков\",\"name\":\"Никита\",\"patronymic\":\"Отчество\",\"status\":\"учится\"}");

        Reader reader3 = new Reader("editStudent::{\"id\":\"1\",\"groupId\":\"2\",\"surname\":\"Щербаков\",\"name\":\"Юрий\",\"patronymic\":\"Отчество\",\"status\":\"учится\"}");
        Writer writer3 = server.executeRequest(reader3);

        assertEquals(writer3.toString(), "200::");

        Reader reader30 = new Reader("getStudentById::{\"id\":\"1\"}");
        Writer writer30 = server.executeRequest(reader30);

        assertEquals(writer30.toString(), "200::{\"groupId\":2,\"surname\":\"Щербаков\",\"name\":\"Юрий\",\"patronymic\":\"Отчество\",\"status\":\"учится\"}");

        Reader reader4 = new Reader("editStudent::{\"id\":\"1\",\"groupId\":\"2\",\"surname\":\"Щербаков\",\"name\":\"Юрий\",\"patronymic\":\"Александрович\",\"status\":\"учится\"}");
        Writer writer4 = server.executeRequest(reader4);

        assertEquals(writer4.toString(), "200::");

        Reader reader40 = new Reader("getStudentById::{\"id\":\"1\"}");
        Writer writer40 = server.executeRequest(reader40);

        assertEquals(writer40.toString(), "200::{\"groupId\":2,\"surname\":\"Щербаков\",\"name\":\"Юрий\",\"patronymic\":\"Александрович\",\"status\":\"учится\"}");

        Reader reader5 = new Reader("editStudent::{\"id\":\"1\",\"groupId\":\"2\",\"surname\":\"Щербаков\",\"name\":\"Юрий\",\"patronymic\":\"Александрович\",\"status\":\"в а/о\"}");
        Writer writer5 = server.executeRequest(reader5);

        assertEquals(writer5.toString(), "200::");

        Reader reader50 = new Reader("getStudentById::{\"id\":\"1\"}");
        Writer writer50 = server.executeRequest(reader50);

        assertEquals(writer50.toString(), "200::{\"groupId\":2,\"surname\":\"Щербаков\",\"name\":\"Юрий\",\"patronymic\":\"Александрович\",\"status\":\"в а/о\"}");
    }

    @Test
    void validateTest() throws Exception {
        Server server = new Server();

        Reader reader1 = new Reader("editStudent::{\"id\":\"6\",\"groupId\":\"\",\"surname\":\"Носов\",\"name\":\"Никита\",\"patronymic\":\"Отчество\",\"status\":\"учится\"}");
        Writer writer1 = server.executeRequest(reader1);

        assertEquals(writer1.toString(), "400::6:\"Validation error\":[\"groupId: empty\"]");

        Reader reader21 = new Reader("editStudent::{\"id\":\"6\",\"groupId\":\"1\",\"surname\":\"\",\"name\":\"Никита\",\"patronymic\":\"Отчество\",\"status\":\"учится\"}");
        Writer writer21 = server.executeRequest(reader21);
        Reader reader22 = new Reader("editStudent::{\"id\":\"6\",\"groupId\":\"9\",\"surname\":\"Носоggergewrgherhgerherherherherherherherherhertherhв\",\"name\":\"Никита\",\"patronymic\":\"Отчество\",\"status\":\"учится\"}");
        Writer writer22 = server.executeRequest(reader22);

        assertEquals(writer21.toString(), "400::6:\"Validation error\":[\"surname: empty\"]");
        assertEquals(writer22.toString(), "400::6:\"Validation error\":[\"surname: big\"]");

        Reader reader31 = new Reader("editStudent::{\"id\":\"6\",\"groupId\":\"1\",\"surname\":\"Носов\",\"name\":\"\",\"patronymic\":\"Отчество\",\"status\":\"учится\"}");
        Writer writer31 = server.executeRequest(reader31);
        Reader reader32 = new Reader("editStudent::{\"id\":\"6\",\"groupId\":\"6\",\"surname\":\"Носов\",\"name\":\"Носоggergewrgherhgerherherherherherherherherhertherhв\",\"patronymic\":\"Отчество\",\"status\":\"учится\"}");
        Writer writer32 = server.executeRequest(reader32);

        assertEquals(writer31.toString(), "400::6:\"Validation error\":[\"name: empty\"]");
        assertEquals(writer32.toString(), "400::6:\"Validation error\":[\"name: big\"]");

        Reader reader41 = new Reader("editStudent::{\"id\":\"6\",\"groupId\":\"1\",\"surname\":\"Носов\",\"name\":\"Никита\",\"patronymic\":\"\",\"status\":\"учится\"}");
        Writer writer41 = server.executeRequest(reader41);
        Reader reader42 = new Reader("editStudent::{\"id\":\"6\",\"groupId\":\"6\",\"surname\":\"Носов\",\"name\":\"Никита\",\"patronymic\":\"Отчесgrgwgwsgsggergergergewrgewrgwgwgweggтво\",\"status\":\"учится\"}");
        Writer writer42 = server.executeRequest(reader42);

        assertEquals(writer41.toString(), "400::6:\"Validation error\":[\"patronymic: empty\"]");
        assertEquals(writer42.toString(), "400::6:\"Validation error\":[\"patronymic: big\"]");

        Reader reader51 = new Reader("editStudent::{\"id\":\"6\",\"id\":\"6\",\"groupId\":\"1\",\"surname\":\"Носов\",\"name\":\"Никита\",\"patronymic\":\"Отчество\",\"status\":\"\"}");
        Writer writer51 = server.executeRequest(reader51);
        Reader reader53 = new Reader("editStudent::{\"id\":\"6\",\"id\":\"6\",\"groupId\":\"1\",\"surname\":\"Носов\",\"name\":\"Никита\",\"patronymic\":\"Отчество\",\"status\":\"нет его\"}");
        Writer writer53 = server.executeRequest(reader53);

        assertEquals(writer51.toString(), "400::6:\"Validation error\":[\"status: empty\",\"status: no status\"]");
        assertEquals(writer53.toString(), "400::6:\"Validation error\":[\"status: no status\"]");

        Reader reader60 = new Reader("editStudent::{\"id\":\"\",\"groupId\":\"6\",\"surname\":\"Носов\",\"name\":\"Никита\",\"patronymic\":\"Отчество\",\"status\":\"учится\"}");
        Writer writer60 = server.executeRequest(reader60);

        assertEquals(writer1.toString(), "400::6:\"Validation error\":[\"groupId: empty\"]");
    }

    @Test
    void exceptionTest() throws Exception {
        Server server = new Server();

        Reader reader01 = new Reader("addStudentGroups::{\"name\":\"MMB-101\"}");
        server.executeRequest(reader01); // 1
        Reader reader02 = new Reader("addStudent::{\"groupId\":\"1\",\"surname\":\"Носов\",\"name\":\"Никита\",\"patronymic\":\"Отчество\",\"status\":\"учится\"}");
        server.executeRequest(reader02); // 1


        Reader reader1 = new Reader("editStudent::{\"id\":\"6\",\"groupId\":\"1\",\"surname\":\"Носов\",\"name\":\"Никита\",\"patronymic\":\"Отчество\",\"status\":\"учится\"}");
        Writer writer1 = server.executeRequest(reader1);

        assertEquals(writer1.toString(), "422::6:\"Нет объекта с данным id\":[]");

        Reader reader2 = new Reader("editStudent::{\"id\":\"1\",\"groupId\":\"6\",\"surname\":\"Носов\",\"name\":\"Никита\",\"patronymic\":\"Отчество\",\"status\":\"учится\"}");
        Writer writer2 = server.executeRequest(reader2);

        assertEquals(writer2.toString(), "422::6:\"Нет объекта с данным id\":[]");
    }
}
