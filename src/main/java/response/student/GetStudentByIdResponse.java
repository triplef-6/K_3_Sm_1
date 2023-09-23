package response.student;

/**
 * получение студента по id
 */
public class GetStudentByIdResponse {
    private String surname;
    private String name;
    private String patronymic;

    public GetStudentByIdResponse() {}

    public  GetStudentByIdResponse(String name, String surname, String patronymic) {

        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void getName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
}
