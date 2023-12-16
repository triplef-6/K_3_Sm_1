package group;

import org.junit.jupiter.api.Test;
import ru_omsu_fctk_simpleserver.server.Reader;
import ru_omsu_fctk_simpleserver.server.Server;
import ru_omsu_fctk_simpleserver.server.Writer;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddStudentGroupsTest {
    @Test
    void addStudentGroupsTest() throws Exception {
        Server server = new Server();
        server.initGroup();

        Reader reader1 = new Reader("addStudentGroups::{\"name\":\"MMB-101\"}");
        Writer writer1 = server.executeRequest(reader1);
        Reader reader2 = new Reader("addStudentGroups::{\"name\":\"MMB-102\"}");
        Writer writer2 = server.executeRequest(reader2);
        Reader reader3 = new Reader("addStudentGroups::{\"name\":\"MMB-103\"}");
        Writer writer3 = server.executeRequest(reader3);

        assertEquals(writer1.toString(), "200::{\"id\":1}");
        assertEquals(writer2.toString(), "200::{\"id\":2}");
        assertEquals(writer3.toString(), "200::{\"id\":3}");
    }

    @Test
    void validateTest() throws Exception {
        Server server = new Server();
        server.initGroup();

        Reader reader1 = new Reader("addStudentGroups::{\"name\":\"\"}");
        Writer writer1 = server.executeRequest(reader1);
        Reader reader2 = new Reader("addStudentGroups::{\"name\":\"MMB-10119851981919851919198198195119519818981981981981819818951\"}");
        Writer writer2 = server.executeRequest(reader2);

        assertEquals(writer1.toString(), "400::6:\"Validation error\":[\"name: empty\"]");
        assertEquals(writer2.toString(), "400::6:\"Validation error\":[\"name: big\"]");
    }
}
