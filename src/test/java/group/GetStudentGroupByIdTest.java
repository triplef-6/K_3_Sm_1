package group;
import org.junit.jupiter.api.Test;
import ru_omsu_fctk_simpleserver.server.Reader;
import ru_omsu_fctk_simpleserver.server.Server;
import ru_omsu_fctk_simpleserver.server.Writer;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetStudentGroupByIdTest {
    @Test
    void getStudentGroupByIdTest() throws Exception {
        Server server = new Server();
        server.initGroup();

        Reader reader1 = new Reader("addStudentGroups::{\"name\":\"MMB-101\"}");
        server.executeRequest(reader1);
        Reader reader2 = new Reader("addStudentGroups::{\"name\":\"MMB-102\"}");
        server.executeRequest(reader2);
        Reader reader3 = new Reader("addStudentGroups::{\"name\":\"MMB-103\"}");
        server.executeRequest(reader3);

        Reader reader10 = new Reader("getStudentGroupById::{\"id\":\"1\"}");
        Writer writer10 = server.executeRequest(reader10);
        Reader reader20 = new Reader("getStudentGroupById::{\"id\":\"2\"}");
        Writer writer20 = server.executeRequest(reader20);
        Reader reader30 = new Reader("getStudentGroupById::{\"id\":\"3\"}");
        Writer writer30 = server.executeRequest(reader30);

        assertEquals(writer10.toString(), "200::{\"name\":\"MMB-101\"}");
        assertEquals(writer20.toString(), "200::{\"name\":\"MMB-102\"}");
        assertEquals(writer30.toString(), "200::{\"name\":\"MMB-103\"}");
    }

    @Test
    void validateTest() throws Exception {
        Server server = new Server();
        server.initGroup();

        Reader reader1 = new Reader("getStudentGroupById::{\"id\":\"\"}");
        Writer writer1 = server.executeRequest(reader1);

        assertEquals(writer1.toString(), "400::6:\"Validation error\":[\"id: zero\"]");
    }

    @Test
    void exceptionTest() throws Exception {
        Server server = new Server();
        server.initGroup();

        Reader reader1 = new Reader("getStudentGroupById::{\"id\":\"5\"}");
        Writer writer1 = server.executeRequest(reader1);

        assertEquals(writer1.toString(), "422::6:\"Нет объекта с данным id\":[]");
    }
}
