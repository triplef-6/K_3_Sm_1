package ru_omsu_fctk_simpleserver.services.student;

import ru_omsu_fctk_simpleserver.exception.ServiceException;
import ru_omsu_fctk_simpleserver.request.student.AddStudentRequest;
import ru_omsu_fctk_simpleserver.response.student.AddStudentResponse;

public interface IAddStudentService {
    AddStudentResponse addStudent(AddStudentRequest request) throws ServiceException;
}
