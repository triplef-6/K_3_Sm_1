package ru_omsu_fctk_simpleserver.controllers.group;

import ru_omsu_fctk_simpleserver.controllers.Service;
import ru_omsu_fctk_simpleserver.essence.Group;
import ru_omsu_fctk_simpleserver.repositories.RepositoryGroup;
import ru_omsu_fctk_simpleserver.request.group.AddStudentGroupsRequest;
import ru_omsu_fctk_simpleserver.response.group.AddStudentGroupsResponse;

public class AddStudentGroupsService implements Service<AddStudentGroupsResponse> {
    private AddStudentGroupsRequest request;
    private RepositoryGroup repositoryGroup;

    public AddStudentGroupsService(AddStudentGroupsRequest request) {
        this.request = request;
    }

    @Override
    public AddStudentGroupsResponse answer() {
        return new AddStudentGroupsResponse(repositoryGroup.addStudentGroup(new Group(request.getName())));
    }
}
