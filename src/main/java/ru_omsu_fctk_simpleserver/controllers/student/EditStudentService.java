package ru_omsu_fctk_simpleserver.controllers.student;

import ru_omsu_fctk_simpleserver.controllers.Service;
import ru_omsu_fctk_simpleserver.repositories.RepositoryStudent;
import ru_omsu_fctk_simpleserver.request.student.EditStudentRequest;
import ru_omsu_fctk_simpleserver.response.student.EditStudentResponse;

public class EditStudentService implements Service<EditStudentResponse> {
    private EditStudentRequest request;
    private RepositoryStudent repositoryStudent;

    public EditStudentService(EditStudentRequest request) {
        this.request = request;
    }

    @Override
    public EditStudentResponse answer() {
        return new EditStudentResponse();
    }
}
