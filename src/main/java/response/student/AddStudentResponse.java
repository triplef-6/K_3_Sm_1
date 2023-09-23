package response.student;

/**
 * добавление нового студента
 */
public class AddStudentResponse {
    private Long id;

    public AddStudentResponse() {}

    public AddStudentResponse(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
