package ru_omsu_fctk_simpleserver.request.subject;

/**
 * добавление новой дисцеплины
 */
public class AddSubjectRequest {
    private String name;
    private String shortName;

    public AddSubjectRequest() {}

    public AddSubjectRequest(String name, String shortName) {
        this.name = name;
        this.shortName = shortName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
