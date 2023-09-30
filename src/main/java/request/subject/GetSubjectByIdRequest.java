package request.subject;

/**
 * получение дисцеплины по id
 */
public class GetSubjectByIdRequest {
    private long id;

    public GetSubjectByIdRequest() {}

    public GetSubjectByIdRequest(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
