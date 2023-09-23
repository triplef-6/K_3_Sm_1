package request.student;

/**
 * удаление студента
 */
public class DeleteStudentRequest {
    private long id;

    public DeleteStudentRequest() {}

    public DeleteStudentRequest(Long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
