package ru_omsu_fctk_simpleserver.controllers.group;

import ru_omsu_fctk_simpleserver.controllers.Service;
import ru_omsu_fctk_simpleserver.repositories.RepositoryGroup;
import ru_omsu_fctk_simpleserver.request.group.EditStudentGroupsRequest;
import ru_omsu_fctk_simpleserver.response.group.EditStudentGroupsResponse;

public class EditStudentGroupsService implements Service<EditStudentGroupsResponse> {
    private EditStudentGroupsRequest request;
    private RepositoryGroup repositoryGroup;

    public EditStudentGroupsService(EditStudentGroupsRequest request) {
        this.request = request;
    }

    @Override
    public EditStudentGroupsResponse answer() {
        return new EditStudentGroupsResponse();
    }
}
