package ru_omsu_fctk_simpleserver.services.audience;

import ru_omsu_fctk_simpleserver.essence.Audience;
import ru_omsu_fctk_simpleserver.essence.Group;
import ru_omsu_fctk_simpleserver.repositories.RepositoryAudience;
import ru_omsu_fctk_simpleserver.repositories.RepositoryGroup;
import ru_omsu_fctk_simpleserver.request.audience.AddAudienceRequest;
import ru_omsu_fctk_simpleserver.request.group.AddStudentGroupsRequest;
import ru_omsu_fctk_simpleserver.response.audience.AddAudienceResponse;
import ru_omsu_fctk_simpleserver.response.group.AddStudentGroupsResponse;

public class AddAudienceService {
    private RepositoryAudience repositoryAudience;

    public AddAudienceService(RepositoryAudience repositoryAudience) {
        this.repositoryAudience = repositoryAudience;
    }


    public AddAudienceResponse addAudience(AddAudienceRequest request) {
        return new AddAudienceResponse(repositoryAudience.addAudience(new Audience(request.getNumber(), request.getBuildingNumber())));
    }


}
