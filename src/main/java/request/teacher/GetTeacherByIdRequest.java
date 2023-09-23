package request.teacher;

/**
 * получение преподавателя по id
 */
public class GetTeacherByIdRequest {
    private long id;

    public GetTeacherByIdRequest() {}

    public GetTeacherByIdRequest(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
