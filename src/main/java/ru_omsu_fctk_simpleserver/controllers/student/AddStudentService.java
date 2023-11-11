package ru_omsu_fctk_simpleserver.controllers.student;

import ru_omsu_fctk_simpleserver.controllers.Service;
import ru_omsu_fctk_simpleserver.essence.Student;
import ru_omsu_fctk_simpleserver.repositories.RepositoryStudent;
import ru_omsu_fctk_simpleserver.request.student.AddStudentRequest;
import ru_omsu_fctk_simpleserver.response.student.AddStudentResponse;

public class AddStudentService implements Service<AddStudentResponse> {
    private AddStudentRequest request;
    private RepositoryStudent repositoryStudent;

    public AddStudentService(AddStudentRequest request) {
        this.request = request;
    }

    @Override
    public AddStudentResponse answer() {
        return new AddStudentResponse(repositoryStudent.addStudent(new Student(Long.parseLong(request.getGroupId()),
                request.getSurname(), request.getName(), request.getStatus())));
    }
}
