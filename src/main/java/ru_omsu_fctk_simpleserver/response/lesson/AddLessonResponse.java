package ru_omsu_fctk_simpleserver.response.lesson;

public class AddLessonResponse {
    private Long id;

    public AddLessonResponse() {}

    public AddLessonResponse(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
