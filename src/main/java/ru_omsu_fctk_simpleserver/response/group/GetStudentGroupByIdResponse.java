package ru_omsu_fctk_simpleserver.response.group;
/**
 * получение группы по id
 */
public class GetStudentGroupByIdResponse {
    private String name;

    public GetStudentGroupByIdResponse() {}

    public GetStudentGroupByIdResponse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void getName(String name) {
        this.name = name;
    }

}
