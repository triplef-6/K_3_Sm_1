package ru_omsu_fctk_simpleserver.services.student;

import ru_omsu_fctk_simpleserver.exception.ServiceException;
import ru_omsu_fctk_simpleserver.services.Service;
import ru_omsu_fctk_simpleserver.repositories.RepositoryStudent;
import ru_omsu_fctk_simpleserver.request.student.DeleteStudentRequest;
import ru_omsu_fctk_simpleserver.response.student.DeleteStudentResponse;

public class DeleteStudentService implements IDeleteStudentService {
    private RepositoryStudent repositoryStudent;

    public DeleteStudentService(RepositoryStudent repositoryStudent) {
        this.repositoryStudent = repositoryStudent;
    }

    @Override
    public DeleteStudentResponse deleteStudent(DeleteStudentRequest request) throws ServiceException {
        return new DeleteStudentResponse();
    }
}
