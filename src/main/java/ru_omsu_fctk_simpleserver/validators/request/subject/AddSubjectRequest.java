package ru_omsu_fctk_simpleserver.validators.request.subject;

/**
 * добавление новой дисцеплины
 */
public class AddSubjectRequest {
    private String name;

    public AddSubjectRequest() {}

    public AddSubjectRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
