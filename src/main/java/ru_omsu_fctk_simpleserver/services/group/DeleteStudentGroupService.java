package ru_omsu_fctk_simpleserver.services.group;

import ru_omsu_fctk_simpleserver.repositories.RepositoryGroup;
import ru_omsu_fctk_simpleserver.request.group.DeleteStudentGroupRequest;
import ru_omsu_fctk_simpleserver.response.group.DeleteStudentGroupResponse;

public class DeleteStudentGroupService implements IDeleteStudentGroupService {

    private RepositoryGroup repositoryGroup;

    @Override
    public DeleteStudentGroupResponse deleteStudentGroup(DeleteStudentGroupRequest request) {
        return new DeleteStudentGroupResponse();
    }
}
