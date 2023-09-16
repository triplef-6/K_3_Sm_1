package Request.Group;

/**
 * получение группы по id
 */
public class GetStudentGroupByldRequest {
    private Long id;

    public GetStudentGroupByldRequest() {}

    public GetStudentGroupByldRequest(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
