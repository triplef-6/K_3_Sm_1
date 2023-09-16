package Response.Group;
/**
 * получение группы по id
 */
public class GetStudentGroupByldResponse {
    private String name;

    public GetStudentGroupByldResponse() {}

    public GetStudentGroupByldResponse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void getName(String name) {
        this.name = name;
    }

}
