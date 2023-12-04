package ru_omsu_fctk_simpleserver.services.group;

import ru_omsu_fctk_simpleserver.repositories.RepositoryGroup;
import ru_omsu_fctk_simpleserver.request.group.GetStudentGroupByIdRequest;
import ru_omsu_fctk_simpleserver.response.group.GetStudentGroupByIdResponse;

public class GetStudentGroupByIdService implements IGetStudentGroupByIdService {
    private RepositoryGroup repositoryGroup;

    public GetStudentGroupByIdService(RepositoryGroup repositoryGroup) {
        this.repositoryGroup = repositoryGroup;
    }

    @Override
    public GetStudentGroupByIdResponse getStudentGroupById(GetStudentGroupByIdRequest request) {
        return new GetStudentGroupByIdResponse(repositoryGroup.getStudentGroupById(request.getId()).getName());
    }
}
