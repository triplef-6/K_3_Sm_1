package ru_omsu_fctk_simpleserver.services.group;

import ru_omsu_fctk_simpleserver.exception.ServiceException;
import ru_omsu_fctk_simpleserver.repositories.RepositoryGroup;
import ru_omsu_fctk_simpleserver.request.group.DeleteStudentGroupRequest;
import ru_omsu_fctk_simpleserver.response.group.DeleteStudentGroupResponse;

public class DeleteStudentGroupService implements IDeleteStudentGroupService {

    private RepositoryGroup repositoryGroup;

    public DeleteStudentGroupService(RepositoryGroup repositoryGroup) {
        this.repositoryGroup = repositoryGroup;
    }

    @Override
    public DeleteStudentGroupResponse deleteStudentGroup(DeleteStudentGroupRequest request) throws ServiceException {
        try {
            repositoryGroup.deleteStudentGroup(request.getId());
            return new DeleteStudentGroupResponse();
        } catch (Exception e) {
            throw new ServiceException(e.getMessage());
        }
    }
}
