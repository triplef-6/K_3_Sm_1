package ru_omsu_fctk_simpleserver.controllers.student;

import ru_omsu_fctk_simpleserver.controllers.Service;
import ru_omsu_fctk_simpleserver.essence.Student;
import ru_omsu_fctk_simpleserver.repositories.RepositoryStudent;
import ru_omsu_fctk_simpleserver.request.student.GetStudentByIdRequest;
import ru_omsu_fctk_simpleserver.response.student.GetStudentByIdResponse;

public class GetStudentByIdService implements Service<GetStudentByIdResponse> {
    private GetStudentByIdRequest request;
    private RepositoryStudent repositoryStudent;

    public GetStudentByIdService(GetStudentByIdRequest request) {
        this.request = request;
    }

    @Override
    public GetStudentByIdResponse answer() {
        Student student = repositoryStudent.getStudentById(request.getId());
        return new GetStudentByIdResponse(student.getName(), student.getSurname(), student.getPatronymic(), student.getStatus());
    }
}
