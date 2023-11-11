package ru_omsu_fctk_simpleserver.controllers.student;

import ru_omsu_fctk_simpleserver.controllers.Service;
import ru_omsu_fctk_simpleserver.essence.Student;
import ru_omsu_fctk_simpleserver.repositories.RepositoryStudent;
import ru_omsu_fctk_simpleserver.request.student.GetStudentByGroupRequest;
import ru_omsu_fctk_simpleserver.response.student.GetStudentByGroupResponse;

import java.util.ArrayList;
import java.util.List;

public class GetStudentByGroupService implements Service<GetStudentByGroupResponse> {
    private GetStudentByGroupRequest request;
    private RepositoryStudent repositoryStudent;

    public GetStudentByGroupService(GetStudentByGroupRequest request) {
        this.request = request;
    }

    @Override
    public GetStudentByGroupResponse answer() {
        List<String> listName = new ArrayList<>();
        List<String> listSurname = new ArrayList<>();
        List<String> listPatronymic = new ArrayList<>();
        List<String> listStatus = new ArrayList<>();

        for (Student student : repositoryStudent.getStudentByGroup(request.getId())) {
            listName.add(student.getName());
            listSurname.add(student.getSurname());
            listPatronymic.add(student.getPatronymic());
            listStatus.add(student.getStatus());
        }

        return new GetStudentByGroupResponse(listName, listSurname, listPatronymic, listStatus);
    }
}
