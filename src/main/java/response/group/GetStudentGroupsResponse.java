package response.group;

import java.util.List;

/**
 * получение списка всех групп
 */
public class GetStudentGroupsResponse {
    private List<String> listName;

    public GetStudentGroupsResponse(List<String> listName) {
        this.listName = listName;
    }

    public List<String> getListName() {
        return listName;
    }

    public void setListName(List<String> listName) {
        this.listName = listName;
    }
}
