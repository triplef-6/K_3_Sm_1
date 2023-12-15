package student;

import org.junit.jupiter.api.Test;
import ru_omsu_fctk_simpleserver.server.Reader;
import ru_omsu_fctk_simpleserver.server.Server;
import ru_omsu_fctk_simpleserver.server.Writer;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetStudentByGroupTest {

    @Test
    void getStudentByGroupTest() throws Exception {
        Server server = new Server();

        Reader reader01 = new Reader("addStudentGroups::{\"name\":\"MMB-101\"}");
        server.executeRequest(reader01); // 1
        Reader reader02 = new Reader("addStudentGroups::{\"name\":\"MMB-102\"}");
        server.executeRequest(reader02); // 2

        Reader reader1 = new Reader("addStudent::{\"groupId\":\"1\",\"surname\":\"Носов\",\"name\":\"Никита\",\"patronymic\":\"Отчество\",\"status\":\"учится\"}");
        server.executeRequest(reader1); // 1
        Reader reader2 = new Reader("addStudent::{\"groupId\":\"2\",\"surname\":\"Алёшкин\",\"name\":\"Александр\",\"patronymic\":\"Отчество\",\"status\":\"в а/о\"}");
        server.executeRequest(reader2); // 2
        Reader reader3 = new Reader("addStudent::{\"groupId\":\"2\",\"surname\":\"Кошевая\",\"name\":\"Анастасия\",\"patronymic\":\"Отчество\",\"status\":\"отчислен\"}");
        server.executeRequest(reader3); // 3

        Reader reader10 = new Reader("getStudentByGroup::{\"groupId\":\"1\"}");
        Writer writer10 = server.executeRequest(reader10);
        Reader reader20 = new Reader("getStudentByGroup::{\"groupId\":\"2\"}");
        Writer writer20 = server.executeRequest(reader20);

        assertEquals(writer10.toString(), "200::{\"listName\":[\"Никита\"],\"listSurname\":[\"Носов\"],\"listPatronymic\":[\"Отчество\"],\"listStatus\":[\"учится\"]}");
        assertEquals(writer20.toString(), "200::{\"listName\":[\"Александр\",\"Анастасия\"],\"listSurname\":[\"Алёшкин\",\"Кошевая\"],\"listPatronymic\":[\"Отчество\",\"Отчество\"],\"listStatus\":[\"в а/о\",\"отчислен\"]}");
    }

    @Test
    void validateTest() throws Exception {
        Server server = new Server();

        Reader reader1 = new Reader("getStudentByGroup::{\"groupId\":\"\"}");
        Writer writer1 = server.executeRequest(reader1);

        assertEquals(writer1.toString(), "400::6:\"Validation error\":[\"groupId: zero\"]");
    }

    @Test
    void exceptionTest() throws Exception {
        Server server = new Server();

        Reader reader1 = new Reader("getStudentByGroup::{\"groupId\":\"5\"}");
        Writer writer1 = server.executeRequest(reader1);

        assertEquals(writer1.toString(), "422::6:\"Нет объекта с данным id\":[]");
    }
}
