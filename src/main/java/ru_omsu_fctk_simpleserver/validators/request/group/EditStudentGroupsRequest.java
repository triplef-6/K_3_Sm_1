package ru_omsu_fctk_simpleserver.validators.request.group;

/**
 * редактирование существующей группы
 */
public class EditStudentGroupsRequest {
    private long id;
    private String name;

    public EditStudentGroupsRequest() {}

    public EditStudentGroupsRequest(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
