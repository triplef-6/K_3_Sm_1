package request.group;

/**
 * получение группы по id
 */
public class GetStudentGroupByldRequest {
    private long id;

    public GetStudentGroupByldRequest() {}

    public GetStudentGroupByldRequest(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

}
