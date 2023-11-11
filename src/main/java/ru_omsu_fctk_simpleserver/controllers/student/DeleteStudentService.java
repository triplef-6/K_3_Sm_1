package ru_omsu_fctk_simpleserver.controllers.student;

import ru_omsu_fctk_simpleserver.controllers.Service;
import ru_omsu_fctk_simpleserver.repositories.RepositoryStudent;
import ru_omsu_fctk_simpleserver.request.student.AddStudentRequest;
import ru_omsu_fctk_simpleserver.request.student.DeleteStudentRequest;
import ru_omsu_fctk_simpleserver.response.student.DeleteStudentResponse;

public class DeleteStudentService implements Service<DeleteStudentResponse> {
    private DeleteStudentRequest request;
    private RepositoryStudent repositoryStudent;

    public DeleteStudentService(DeleteStudentRequest request) {
        this.request = request;
    }

    @Override
    public DeleteStudentResponse answer() {
        return new DeleteStudentResponse();
    }
}
