package ru_omsu_fctk_simpleserver.services.student;

import ru_omsu_fctk_simpleserver.exception.ServiceException;
import ru_omsu_fctk_simpleserver.request.student.GetStudentByIdRequest;
import ru_omsu_fctk_simpleserver.response.student.GetStudentByIdResponse;

public interface IGetStudentByIdService {
    GetStudentByIdResponse getStudentById(GetStudentByIdRequest request) throws ServiceException;
}
