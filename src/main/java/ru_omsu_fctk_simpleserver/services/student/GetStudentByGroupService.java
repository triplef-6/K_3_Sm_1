package ru_omsu_fctk_simpleserver.services.student;

import ru_omsu_fctk_simpleserver.exception.ServiceException;
import ru_omsu_fctk_simpleserver.services.Service;
import ru_omsu_fctk_simpleserver.essence.Student;
import ru_omsu_fctk_simpleserver.repositories.RepositoryStudent;
import ru_omsu_fctk_simpleserver.request.student.GetStudentByGroupRequest;
import ru_omsu_fctk_simpleserver.response.student.GetStudentByGroupResponse;

import java.util.ArrayList;
import java.util.List;

public class GetStudentByGroupService implements IGetStudentByGroupService {
    private RepositoryStudent repositoryStudent;

    @Override
    public GetStudentByGroupResponse getStudentByGroup(GetStudentByGroupRequest request) throws ServiceException {
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
