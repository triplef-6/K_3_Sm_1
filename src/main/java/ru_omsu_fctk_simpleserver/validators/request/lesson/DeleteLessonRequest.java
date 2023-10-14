package ru_omsu_fctk_simpleserver.validators.request.lesson;

/**
 * удаление занятия
 */
public class DeleteLessonRequest {
    private long id;

    public DeleteLessonRequest() {
    }

    public DeleteLessonRequest(Long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
