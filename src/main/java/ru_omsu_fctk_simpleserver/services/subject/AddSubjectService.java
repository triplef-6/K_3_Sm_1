package ru_omsu_fctk_simpleserver.services.subject;

import ru_omsu_fctk_simpleserver.essence.Group;
import ru_omsu_fctk_simpleserver.essence.Subject;
import ru_omsu_fctk_simpleserver.repositories.RepositoryGroup;
import ru_omsu_fctk_simpleserver.repositories.RepositorySubject;
import ru_omsu_fctk_simpleserver.request.group.AddStudentGroupsRequest;
import ru_omsu_fctk_simpleserver.request.subject.AddSubjectRequest;
import ru_omsu_fctk_simpleserver.response.group.AddStudentGroupsResponse;
import ru_omsu_fctk_simpleserver.response.subject.AddSubjectsResponse;

public class AddSubjectService {
    private RepositorySubject repositorySubject;

    public AddSubjectService(RepositorySubject repositorySubject) {
        this.repositorySubject = repositorySubject;
    }


    public AddSubjectsResponse addSubject(AddSubjectRequest request) {
        return new AddSubjectsResponse(repositorySubject.addSubject(new Subject(request.getName(), request.getShortName())));
    }
}
