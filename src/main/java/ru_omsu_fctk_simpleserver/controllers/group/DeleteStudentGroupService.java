package ru_omsu_fctk_simpleserver.controllers.group;

import ru_omsu_fctk_simpleserver.controllers.Service;
import ru_omsu_fctk_simpleserver.repositories.RepositoryGroup;
import ru_omsu_fctk_simpleserver.request.group.DeleteStudentGroupRequest;
import ru_omsu_fctk_simpleserver.response.group.DeleteStudentGroupResponse;

public class DeleteStudentGroupService implements Service<DeleteStudentGroupResponse> {
    private DeleteStudentGroupRequest request;
    private RepositoryGroup repositoryGroup;

    public DeleteStudentGroupService(DeleteStudentGroupRequest request) {
        this.request = request;
    }

    @Override
    public DeleteStudentGroupResponse answer() {
        return new DeleteStudentGroupResponse();
    }
}
