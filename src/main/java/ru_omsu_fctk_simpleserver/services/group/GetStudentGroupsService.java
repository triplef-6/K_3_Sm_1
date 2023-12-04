package ru_omsu_fctk_simpleserver.services.group;

import ru_omsu_fctk_simpleserver.essence.Group;
import ru_omsu_fctk_simpleserver.repositories.RepositoryGroup;
import ru_omsu_fctk_simpleserver.request.group.GetStudentGroupsRequest;
import ru_omsu_fctk_simpleserver.response.group.GetStudentGroupsResponse;

import java.util.ArrayList;
import java.util.List;

public class GetStudentGroupsService implements IGetStudentGroupsService {
    private RepositoryGroup repositoryGroup;

    public GetStudentGroupsService(RepositoryGroup repositoryGroup) {
        this.repositoryGroup = repositoryGroup;
    }

    @Override
    public GetStudentGroupsResponse getStudentGroups(GetStudentGroupsRequest request) {
        List<String> groups = new ArrayList<>();
        for (Group group : repositoryGroup.getStudentGroups()) {
            groups.add(group.getName());
        }
        return new GetStudentGroupsResponse(groups);
    }
}
