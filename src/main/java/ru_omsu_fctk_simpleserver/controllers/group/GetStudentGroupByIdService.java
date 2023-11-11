package ru_omsu_fctk_simpleserver.controllers.group;

import ru_omsu_fctk_simpleserver.controllers.Service;
import ru_omsu_fctk_simpleserver.repositories.RepositoryGroup;
import ru_omsu_fctk_simpleserver.request.group.GetStudentGroupByIdRequest;
import ru_omsu_fctk_simpleserver.response.group.GetStudentGroupByIdResponse;

public class GetStudentGroupByIdService implements Service<GetStudentGroupByIdResponse> {
    private GetStudentGroupByIdRequest request;
    private RepositoryGroup repositoryGroup;

    public GetStudentGroupByIdService(GetStudentGroupByIdRequest request) {
        this.request = request;
    }

    @Override
    public GetStudentGroupByIdResponse answer() {
        return new GetStudentGroupByIdResponse(repositoryGroup.getStudentGroupById(request.getId()).getName());
    }
}
