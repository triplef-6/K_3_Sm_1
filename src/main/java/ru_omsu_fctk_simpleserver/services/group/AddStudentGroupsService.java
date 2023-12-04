package ru_omsu_fctk_simpleserver.services.group;

import ru_omsu_fctk_simpleserver.essence.Group;
import ru_omsu_fctk_simpleserver.exception.ServiceException;
import ru_omsu_fctk_simpleserver.repositories.RepositoryGroup;
import ru_omsu_fctk_simpleserver.request.group.AddStudentGroupsRequest;
import ru_omsu_fctk_simpleserver.response.group.AddStudentGroupsResponse;

public class AddStudentGroupsService implements IAddStudentGroupsService {
    private RepositoryGroup repositoryGroup;

    public AddStudentGroupsService(RepositoryGroup repositoryGroup) {
        this.repositoryGroup = repositoryGroup;
    }

    @Override
    public AddStudentGroupsResponse addStudentGroups(AddStudentGroupsRequest request) throws ServiceException {
//        try {
//            AddStudentGroupsResponse response = new AddStudentGroupsResponse(repositoryGroup.addStudentGroup(new Group(request.getName())));
//        } catch (Exception exception) {
//            throw ServiceException("Repository error");
//        }
//        return response;
        return new AddStudentGroupsResponse(repositoryGroup.addStudentGroup(new Group(request.getName())));
    }
}
