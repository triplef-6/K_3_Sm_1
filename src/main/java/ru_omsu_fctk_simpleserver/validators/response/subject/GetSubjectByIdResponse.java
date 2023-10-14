package ru_omsu_fctk_simpleserver.validators.response.subject;

/**
 * получение дисцеплины по id
 */
public class GetSubjectByIdResponse {
    private String name;

    public GetSubjectByIdResponse() {}

    public GetSubjectByIdResponse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void getName(String name) {
        this.name = name;
    }
}
