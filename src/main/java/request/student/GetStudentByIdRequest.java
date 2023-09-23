package request.student;

/**
 * получение студента по id
 */
public class GetStudentByIdRequest {
    private Long id;

    public GetStudentByIdRequest() {}

    public GetStudentByIdRequest(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
