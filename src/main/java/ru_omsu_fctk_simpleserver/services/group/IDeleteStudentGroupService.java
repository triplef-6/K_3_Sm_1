package ru_omsu_fctk_simpleserver.services.group;

import ru_omsu_fctk_simpleserver.exception.ServiceException;
import ru_omsu_fctk_simpleserver.request.group.DeleteStudentGroupRequest;
import ru_omsu_fctk_simpleserver.response.group.DeleteStudentGroupResponse;

public interface IDeleteStudentGroupService {
    DeleteStudentGroupResponse deleteStudentGroup(DeleteStudentGroupRequest request) throws ServiceException;
}
