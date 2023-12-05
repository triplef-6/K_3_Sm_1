import ru_omsu_fctk_simpleserver.server.Reader;
import ru_omsu_fctk_simpleserver.server.Server;
import ru_omsu_fctk_simpleserver.server.Writer;

public class MEIN {
    public static void main(String[] args) throws Exception {
        Server server = new Server();

        try {
            Reader reader1 = new Reader("addStudentGroups::{\"name\":\"MMB-103\"}");
            Writer writer1 = server.executeRequest(reader1);
            System.out.println(writer1);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
