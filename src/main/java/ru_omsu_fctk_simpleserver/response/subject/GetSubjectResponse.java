package ru_omsu_fctk_simpleserver.response.subject;

import java.util.List;

/**
 * получение списка всех дисцеплин
 */
public class GetSubjectResponse {
    private List<String> listName;

    public GetSubjectResponse(List<String> listName) {
        this.listName = listName;
    }

    public List<String> getListName() {
        return listName;
    }

    public void setListName(List<String> listName) {
        this.listName = listName;
    }
}
