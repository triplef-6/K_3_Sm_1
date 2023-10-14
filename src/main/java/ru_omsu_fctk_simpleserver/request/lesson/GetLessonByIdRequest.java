package ru_omsu_fctk_simpleserver.request.lesson;

/**
 * получение занятия по id (с данными о посещаемости)
 */
public class GetLessonByIdRequest {
    private long id;

    public GetLessonByIdRequest() {}

    public GetLessonByIdRequest(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
