package ru_omsu_fctk_simpleserver.services.student;

import ru_omsu_fctk_simpleserver.exception.ServiceException;
import ru_omsu_fctk_simpleserver.services.Service;
import ru_omsu_fctk_simpleserver.essence.Student;
import ru_omsu_fctk_simpleserver.repositories.RepositoryStudent;
import ru_omsu_fctk_simpleserver.request.student.GetStudentByIdRequest;
import ru_omsu_fctk_simpleserver.response.student.GetStudentByIdResponse;

public class GetStudentByIdService implements IGetStudentByIdService {
    private RepositoryStudent repositoryStudent;

    @Override
    public GetStudentByIdResponse getStudentById(GetStudentByIdRequest request) throws ServiceException {
        Student student = repositoryStudent.getStudentById(request.getId());
        return new GetStudentByIdResponse(student.getName(), student.getSurname(), student.getPatronymic(), student.getStatus());
    }
}
