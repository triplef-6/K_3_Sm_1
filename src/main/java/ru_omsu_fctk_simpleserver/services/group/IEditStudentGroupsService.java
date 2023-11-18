package ru_omsu_fctk_simpleserver.services.group;

import ru_omsu_fctk_simpleserver.exception.ServiceException;
import ru_omsu_fctk_simpleserver.request.group.EditStudentGroupsRequest;
import ru_omsu_fctk_simpleserver.response.group.EditStudentGroupsResponse;

public interface IEditStudentGroupsService {
    EditStudentGroupsResponse editStudentGroups(EditStudentGroupsRequest request) throws ServiceException;
}
