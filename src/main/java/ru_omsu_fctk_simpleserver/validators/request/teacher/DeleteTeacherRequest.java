package ru_omsu_fctk_simpleserver.validators.request.teacher;

/**
 * удаление преподавателя
 */
public class DeleteTeacherRequest {
    private long id;

    public DeleteTeacherRequest() {}

    public DeleteTeacherRequest(Long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
