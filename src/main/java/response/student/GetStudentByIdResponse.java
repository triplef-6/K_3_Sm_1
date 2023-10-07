package response.student;

/**
 * получение студента по id
 */
public class GetStudentByIdResponse {
    private String surname;
    private String name;
    private String patronymic;
    private String status;

    public GetStudentByIdResponse() {}

    public  GetStudentByIdResponse(String name, String surname, String patronymic, String status) {

        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
