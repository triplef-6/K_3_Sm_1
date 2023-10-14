package ru_omsu_fctk_simpleserver.response.subject;

/**
 * добавление новой дисцеплины
 */
public class AddSubjectsResponse {
    private long id;

    public AddSubjectsResponse() {}

    public AddSubjectsResponse(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
