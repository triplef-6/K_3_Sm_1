package ru_omsu_fctk_simpleserver.services.student;

import ru_omsu_fctk_simpleserver.exception.ServiceException;
import ru_omsu_fctk_simpleserver.services.Service;
import ru_omsu_fctk_simpleserver.essence.Student;
import ru_omsu_fctk_simpleserver.repositories.RepositoryStudent;
import ru_omsu_fctk_simpleserver.request.student.AddStudentRequest;
import ru_omsu_fctk_simpleserver.response.student.AddStudentResponse;

public class AddStudentService implements IAddStudentService {
    private RepositoryStudent repositoryStudent;

    public AddStudentService(RepositoryStudent repositoryStudent) {
        this.repositoryStudent = repositoryStudent;
    }

    @Override
    public AddStudentResponse addStudent(AddStudentRequest request) {
        return new AddStudentResponse(repositoryStudent.addStudent(new Student(Long.parseLong(request.getGroupId()),
                request.getSurname(), request.getName(),request.getPatronymic(), request.getStatus())));
    }
}
