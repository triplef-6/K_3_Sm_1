package request.student;

/**
 * получение студента по id
 */
public class GetStudentByIdRequest {
    private long id;

    public GetStudentByIdRequest() {}

    public GetStudentByIdRequest(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

}
