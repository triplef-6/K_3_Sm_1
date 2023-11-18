package ru_omsu_fctk_simpleserver.services.student;

import ru_omsu_fctk_simpleserver.exception.ServiceException;
import ru_omsu_fctk_simpleserver.request.student.GetStudentByGroupRequest;
import ru_omsu_fctk_simpleserver.response.student.GetStudentByGroupResponse;

public interface IGetStudentByGroupService {
    GetStudentByGroupResponse getStudentByGroup(GetStudentByGroupRequest request) throws ServiceException;
}
