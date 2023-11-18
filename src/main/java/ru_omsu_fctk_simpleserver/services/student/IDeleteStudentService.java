package ru_omsu_fctk_simpleserver.services.student;

import ru_omsu_fctk_simpleserver.exception.ServiceException;
import ru_omsu_fctk_simpleserver.request.student.DeleteStudentRequest;
import ru_omsu_fctk_simpleserver.response.student.DeleteStudentResponse;

public interface IDeleteStudentService {
    DeleteStudentResponse deleteStudent(DeleteStudentRequest request) throws ServiceException;
}
