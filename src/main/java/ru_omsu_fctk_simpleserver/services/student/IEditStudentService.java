package ru_omsu_fctk_simpleserver.services.student;

import ru_omsu_fctk_simpleserver.exception.ServiceException;
import ru_omsu_fctk_simpleserver.request.student.EditStudentRequest;
import ru_omsu_fctk_simpleserver.response.student.EditStudentResponse;

public interface IEditStudentService {
    EditStudentResponse editStudent(EditStudentRequest request) throws ServiceException;
}
