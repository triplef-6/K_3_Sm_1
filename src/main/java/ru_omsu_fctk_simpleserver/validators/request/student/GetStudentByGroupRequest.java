package ru_omsu_fctk_simpleserver.validators.request.student;

/**
 * получение студентов по id группы
 */
public class GetStudentByGroupRequest {
    private long id;

    public GetStudentByGroupRequest() {}

    public GetStudentByGroupRequest(long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
