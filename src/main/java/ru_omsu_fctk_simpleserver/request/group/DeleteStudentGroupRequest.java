package ru_omsu_fctk_simpleserver.request.group;

public class DeleteStudentGroupRequest {
    private long id;

    public DeleteStudentGroupRequest() {
    }
    public DeleteStudentGroupRequest(Long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
