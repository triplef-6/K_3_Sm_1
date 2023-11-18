package ru_omsu_fctk_simpleserver.services.group;

import ru_omsu_fctk_simpleserver.repositories.RepositoryGroup;
import ru_omsu_fctk_simpleserver.request.group.EditStudentGroupsRequest;
import ru_omsu_fctk_simpleserver.response.group.EditStudentGroupsResponse;

public class EditStudentGroupsService implements IEditStudentGroupsService {
    private RepositoryGroup repositoryGroup;

    @Override
    public EditStudentGroupsResponse editStudentGroups(EditStudentGroupsRequest request) {
        return new EditStudentGroupsResponse();
    }
}
