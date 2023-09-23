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

    public EditStudentRequest() {}

    public EditStudentRequest(Long id, Long groupId, String surname, String name, String patronymic) {
        this.id = id;
        this.groupId = groupId;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long id_group) {
        this.groupId = id_group;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
}
