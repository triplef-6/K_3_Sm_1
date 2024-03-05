package ru_omsu_fctk_simpleserver.services.subject;

import ru_omsu_fctk_simpleserver.exception.ServiceException;
import ru_omsu_fctk_simpleserver.repositories.RepositoryGroup;
import ru_omsu_fctk_simpleserver.repositories.RepositorySubject;
import ru_omsu_fctk_simpleserver.request.group.DeleteStudentGroupRequest;
import ru_omsu_fctk_simpleserver.request.subject.DeleteSubjectRequest;
import ru_omsu_fctk_simpleserver.response.group.DeleteStudentGroupResponse;
import ru_omsu_fctk_simpleserver.response.subject.DeleteSubjectResponse;

public class DeleteSubjectService {
    private RepositorySubject repositorySubject;

    public DeleteSubjectService(RepositorySubject repositorySubject) {
        this.repositorySubject = repositorySubject;
    }


    public DeleteSubjectResponse deleteSubject(DeleteSubjectRequest request) throws ServiceException {
        try {
            repositorySubject.deleteSubject(request.getId());
            return new DeleteSubjectResponse();
        } catch (Exception e) {
            throw new ServiceException(e.getMessage());
        }
    }



}
