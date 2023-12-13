package group;
import org.junit.jupiter.api.Test;
import ru_omsu_fctk_simpleserver.server.Reader;
import ru_omsu_fctk_simpleserver.server.Server;
import ru_omsu_fctk_simpleserver.server.Writer;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DeleteStudentGroupTest {
    
    @Test
    void deleteStudentGroupTest() throws Exception {
        Server server = new Server();

        Reader reader1 = new Reader("addStudentGroups::{\"name\":\"MMB-101\"}");
        Writer writer1 = server.executeRequest(reader1); // 1
        Reader reader2 = new Reader("addStudentGroups::{\"name\":\"MMB-102\"}");
        Writer writer2 = server.executeRequest(reader2); // 2

        Reader reader10 = new Reader("deleteStudentGroup::{\"id\":\"1\"}}");
        Writer writer10 = server.executeRequest(reader10);
        Reader reader20 = new Reader("deleteStudentGroup::{\"id\":\"2\"}}");
        Writer writer20 = server.executeRequest(reader20);

        assertEquals(writer10.toString(), "200::");
        assertEquals(writer20.toString(), "200::");

        Reader reader100 = new Reader("getStudentGroupById::{\"id\":\"1\"}");
        Writer writer100 = server.executeRequest(reader100);
        Reader reader200 = new Reader("getStudentGroupById::{\"id\":\"2\"}");
        Writer writer200 = server.executeRequest(reader200);


        assertEquals(writer100.toString(), "422::6:\"Нет объекта с данным id\":[]");
        assertEquals(writer200.toString(), "422::6:\"Нет объекта с данным id\":[]");
    }

    @Test
    void validateTest() throws Exception {
        Server server = new Server();

        Reader reader1 = new Reader("deleteStudentGroup::{\"id\":\"\"}");
        Writer writer1 = server.executeRequest(reader1);

        assertEquals(writer1.toString(), "400::6:\"Validation error\":[\"id: zero\"]");
    }

    @Test
    void exceptionTest() throws Exception {
        Server server = new Server();
        Reader reader1 = new Reader("deleteStudentGroup::{\"id\":\"5\"}");
        Writer writer1 = server.executeRequest(reader1);

        assertEquals(writer1.toString(), "422::6:\"Нет объекта с данным id\":[]");
    }
}
