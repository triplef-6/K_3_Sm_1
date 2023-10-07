package request.group;

/**
 * получение группы по id
 */
public class GetStudentGroupByIdRequest {
    private long id;

    public GetStudentGroupByIdRequest() {}

    public GetStudentGroupByIdRequest(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

}