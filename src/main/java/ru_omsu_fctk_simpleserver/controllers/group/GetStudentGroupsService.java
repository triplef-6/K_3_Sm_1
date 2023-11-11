package ru_omsu_fctk_simpleserver.controllers.group;

import ru_omsu_fctk_simpleserver.controllers.Service;
import ru_omsu_fctk_simpleserver.essence.Group;
import ru_omsu_fctk_simpleserver.repositories.RepositoryGroup;
import ru_omsu_fctk_simpleserver.request.group.GetStudentGroupsRequest;
import ru_omsu_fctk_simpleserver.response.group.GetStudentGroupsResponse;

import java.util.ArrayList;
import java.util.List;

public class GetStudentGroupsService implements Service<GetStudentGroupsResponse> {
    private GetStudentGroupsRequest request;
    private RepositoryGroup repositoryGroup;

    public GetStudentGroupsService(GetStudentGroupsRequest request) {
        this.request = request;
    }

    @Override
    public GetStudentGroupsResponse answer() {
        List<String> groups = new ArrayList<>();
        for (Group group : repositoryGroup.getStudentGroups()) {
            groups.add(group.getName());
        }
        return new GetStudentGroupsResponse(groups);
    }
}
