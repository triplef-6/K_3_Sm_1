package ru_omsu_fctk_simpleserver.request.student;

/**
 * получение студентов по id группы
 */
public class GetStudentByGroupRequest {
    private long groupId;

    public GetStudentByGroupRequest() {}

    public GetStudentByGroupRequest(long id) {
        this.groupId = id;
    }

    public Long getGroupId() {
        return groupId;
    }
}
