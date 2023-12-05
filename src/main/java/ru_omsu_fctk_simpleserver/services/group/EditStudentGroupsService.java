package ru_omsu_fctk_simpleserver.services.group;

import ru_omsu_fctk_simpleserver.essence.Group;
import ru_omsu_fctk_simpleserver.exception.ServiceException;
import ru_omsu_fctk_simpleserver.repositories.RepositoryGroup;
import ru_omsu_fctk_simpleserver.request.group.EditStudentGroupsRequest;
import ru_omsu_fctk_simpleserver.response.group.DeleteStudentGroupResponse;
import ru_omsu_fctk_simpleserver.response.group.EditStudentGroupsResponse;

public class EditStudentGroupsService implements IEditStudentGroupsService {
    private RepositoryGroup repositoryGroup;

    public EditStudentGroupsService(RepositoryGroup repositoryGroup) {
        this.repositoryGroup = repositoryGroup;
    }

    @Override
    public EditStudentGroupsResponse editStudentGroups(EditStudentGroupsRequest request) throws ServiceException {
        try {
            repositoryGroup.editStudentGroup(new Group(request.getId(), request.getName()));
            return new EditStudentGroupsResponse();
        } catch (Exception e) {
            throw new ServiceException(e.getMessage());
        }
    }
}
