package Request.Student;

/**
 * получение студентов по id группы
 */
public class GetStudentByGroupRequest {
    private Long id;

    public GetStudentByGroupRequest() {}

    public GetStudentByGroupRequest(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



}
