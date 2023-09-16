package Request.Student;

/**
 * удаление студента
 */
public class DeleteStudentRequest {
    private Long id;

    public DeleteStudentRequest() {}

    public DeleteStudentRequest(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
