package student;

import org.junit.jupiter.api.Test;
import ru_omsu_fctk_simpleserver.server.Reader;
import ru_omsu_fctk_simpleserver.server.Server;
import ru_omsu_fctk_simpleserver.server.Writer;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetStudentByIdTest {

    @Test
    void getStudentByIdTest() throws Exception {
        Server server = new Server();
        server.initGroup();
        server.initStudent();

        Reader reader01 = new Reader("addStudentGroups::{\"name\":\"MMB-101\"}");
        server.executeRequest(reader01); // 1
        Reader reader02 = new Reader("addStudentGroups::{\"name\":\"MMB-102\"}");
        server.executeRequest(reader02); // 2
        Reader reader03 = new Reader("addStudentGroups::{\"name\":\"MMB-103\"}");
        server.executeRequest(reader03); // 3

        Reader reader1 = new Reader("addStudent::{\"groupId\":\"1\",\"surname\":\"Носов\",\"name\":\"Никита\",\"patronymic\":\"Отчество\",\"status\":\"учится\"}");
        server.executeRequest(reader1); // 1
        Reader reader2 = new Reader("addStudent::{\"groupId\":\"3\",\"surname\":\"Алёшкин\",\"name\":\"Александр\",\"patronymic\":\"Отчество\",\"status\":\"в а/о\"}");
        server.executeRequest(reader2); // 2
        Reader reader3 = new Reader("addStudent::{\"groupId\":\"2\",\"surname\":\"Кошевая\",\"name\":\"Анастасия\",\"patronymic\":\"Отчество\",\"status\":\"отчислен\"}");
        server.executeRequest(reader3); // 3

        Reader reader10 = new Reader("getStudentById::{\"id\":\"1\"}");
        Writer writer10 = server.executeRequest(reader10);
        Reader reader20 = new Reader("getStudentById::{\"id\":\"2\"}");
        Writer writer20 = server.executeRequest(reader20);
        Reader reader30 = new Reader("getStudentById::{\"id\":\"3\"}");
        Writer writer30 = server.executeRequest(reader30);

        assertEquals(writer10.toString(), "200::{\"groupId\":1,\"surname\":\"Носов\",\"name\":\"Никита\",\"patronymic\":\"Отчество\",\"status\":\"учится\"}");
        assertEquals(writer20.toString(), "200::{\"groupId\":3,\"surname\":\"Алёшкин\",\"name\":\"Александр\",\"patronymic\":\"Отчество\",\"status\":\"в а/о\"}");
        assertEquals(writer30.toString(), "200::{\"groupId\":2,\"surname\":\"Кошевая\",\"name\":\"Анастасия\",\"patronymic\":\"Отчество\",\"status\":\"отчислен\"}");
    }

    @Test
    void validateTest() throws Exception {
        Server server = new Server();
        server.initGroup();
        server.initStudent();

        Reader reader1 = new Reader("getStudentById::{\"id\":\"\"}");
        Writer writer1 = server.executeRequest(reader1);

        assertEquals(writer1.toString(), "400::6:\"Validation error\":[\"id: zero\"]");
    }

    @Test
    void exceptionTest() throws Exception {
        Server server = new Server();
        server.initGroup();
        server.initStudent();

        Reader reader1 = new Reader("getStudentById::{\"id\":\"5\"}");
        Writer writer1 = server.executeRequest(reader1);

        assertEquals(writer1.toString(), "422::6:\"Нет объекта с данным id\":[]");
    }
}
