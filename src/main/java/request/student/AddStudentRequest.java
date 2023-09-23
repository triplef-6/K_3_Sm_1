package request.student;

/**
 * добавление нового студента
 */
public class AddStudentRequest {
    private long groupId;
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

    public long getGroupId() {
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
}
