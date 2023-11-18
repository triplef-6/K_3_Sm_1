package ru_omsu_fctk_simpleserver.services.group;

import ru_omsu_fctk_simpleserver.exception.ServiceException;
import ru_omsu_fctk_simpleserver.request.group.AddStudentGroupsRequest;
import ru_omsu_fctk_simpleserver.response.group.AddStudentGroupsResponse;

public interface IAddStudentGroupsService {
    AddStudentGroupsResponse addStudentGroups(AddStudentGroupsRequest request) throws ServiceException;
}
