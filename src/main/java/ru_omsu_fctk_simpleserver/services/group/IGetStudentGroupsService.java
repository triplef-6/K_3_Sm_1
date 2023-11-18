package ru_omsu_fctk_simpleserver.services.group;

import ru_omsu_fctk_simpleserver.exception.ServiceException;
import ru_omsu_fctk_simpleserver.request.group.GetStudentGroupsRequest;
import ru_omsu_fctk_simpleserver.response.group.GetStudentGroupsResponse;

public interface IGetStudentGroupsService {
    GetStudentGroupsResponse getStudentGroups(GetStudentGroupsRequest request) throws ServiceException;
}
