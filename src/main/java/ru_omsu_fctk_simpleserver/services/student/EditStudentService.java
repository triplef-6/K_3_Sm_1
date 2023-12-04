package ru_omsu_fctk_simpleserver.services.student;

import ru_omsu_fctk_simpleserver.exception.ServiceException;
import ru_omsu_fctk_simpleserver.services.Service;
import ru_omsu_fctk_simpleserver.repositories.RepositoryStudent;
import ru_omsu_fctk_simpleserver.request.student.EditStudentRequest;
import ru_omsu_fctk_simpleserver.response.student.EditStudentResponse;

public class EditStudentService implements IEditStudentService {
    private RepositoryStudent repositoryStudent;

    public EditStudentService(RepositoryStudent repositoryStudent) {
        this.repositoryStudent = repositoryStudent;
    }

    @Override
    public EditStudentResponse editStudent(EditStudentRequest request) throws ServiceException {
        return new EditStudentResponse();
    }
}
