package Request.Student;

/**
 * добавление нового студента
 */
public class AddStudentRequest {
    private Long groupId;
    private String surname;
    private String name;
    private String patronymic;

    public AddStudentRequest() {}

    public AddStudentRequest(Long groupId, String surname, String name, String patronymic) {
        this.groupId = groupId;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
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
