package ru_omsu_fctk_simpleserver.services.group;

import ru_omsu_fctk_simpleserver.exception.ServiceException;
import ru_omsu_fctk_simpleserver.request.group.GetStudentGroupByIdRequest;
import ru_omsu_fctk_simpleserver.response.group.GetStudentGroupByIdResponse;

public interface IGetStudentGroupByIdService {
    GetStudentGroupByIdResponse getStudentGroupById(GetStudentGroupByIdRequest request) throws ServiceException;
}
