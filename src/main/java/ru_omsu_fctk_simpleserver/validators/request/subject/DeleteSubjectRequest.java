package ru_omsu_fctk_simpleserver.validators.request.subject;

/**
 * удаление дисцеплины
 */
public class DeleteSubjectRequest {
    private long id;

    public DeleteSubjectRequest() {
    }
    public DeleteSubjectRequest(Long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
