import ru_omsu_fctk_simpleserver.server.Reader;
import ru_omsu_fctk_simpleserver.server.Server;
import ru_omsu_fctk_simpleserver.server.Writer;

public class MEIN {
    public static void main(String[] args) throws Exception {
        Server server = new Server();

        try {
            Reader[] readers = {
                    new Reader("addStudentGroups::{\"name\":\"MMB-101\"}"),
                    new Reader("addStudentGroups::{\"name\":\"MMB-102\"}"),
                    new Reader("addStudentGroups::{\"name\":\"MMB-103\"}"),
                    new Reader("addStudentGroups::{\"name\":\"MMB-104\"}"),

                    new Reader("getStudentGroupById::{\"id\":\"1\"}"),
                    new Reader("getStudentGroupById::{\"id\":\"2\"}"),
                    new Reader("getStudentGroupById::{\"id\":\"3\"}"),
                    new Reader("getStudentGroupById::{\"id\":\"4\"}"),

                    new Reader("editStudentGroups::{\"id\":\"3\",\"name\":\"\"}"),
                    new Reader("getStudentGroupById::{\"id\":\"3\"}"),

                    new Reader("deleteStudentGroup::{\"id\":\"1\"}"),
                    new Reader("getStudentGroupById::{\"id\":\"1\"}"),

                    new Reader("deleteStudentGroup::{\"id\":\"2\"}"),

                    new Reader("editStudentGroups:: ")
            };
            Writer[] writers = new Writer[readers.length];
            for (int i = 0; i < readers.length; i++) {
                writers[i] = server.executeRequest(readers[i]);
                System.out.println(writers[i]);
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
