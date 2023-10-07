package request.student;

/**
 * редактирование студента
 */
public class EditStudentRequest {
    private Long id;
    private Long groupId;
    private String surname;
    private String name;
    private String patronymic;
    private String status;

    public EditStudentRequest() {}

    public EditStudentRequest(Long id, Long groupId, String surname, String name, String patronymic, String status) {
        this.id = id;
        this.groupId = groupId;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public Long getGroupId() {
        return groupId;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getStatus() {
        return status;
    }
}
