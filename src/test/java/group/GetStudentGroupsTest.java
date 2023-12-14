package group;

import org.junit.jupiter.api.Test;
import ru_omsu_fctk_simpleserver.server.Reader;
import ru_omsu_fctk_simpleserver.server.Server;
import ru_omsu_fctk_simpleserver.server.Writer;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetStudentGroupsTest {

    @Test
    void getStudentGroupsTest() throws Exception {
        Server server = new Server();

        Reader reader0 = new Reader("getStudentGroups:: ");
        Writer writer0 = server.executeRequest(reader0);

        assertEquals(writer0.toString(), "200::{\"listName\":[]}");

        Reader reader1 = new Reader("addStudentGroups::{\"name\":\"MMB-101\"}");
        server.executeRequest(reader1);
        Reader reader2 = new Reader("addStudentGroups::{\"name\":\"MMB-102\"}");
        server.executeRequest(reader2);
        Reader reader3 = new Reader("addStudentGroups::{\"name\":\"MMB-103\"}");
        server.executeRequest(reader3);

        Reader reader00 = new Reader("getStudentGroups:: ");
        Writer writer00 = server.executeRequest(reader00);

        assertEquals(writer00.toString(), "200::{\"listName\":[\"MMB-101\",\"MMB-102\",\"MMB-103\"]}");
    }
}
