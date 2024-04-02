package ru_omsu_fctk_simpleserver.services.audience;

import ru_omsu_fctk_simpleserver.essence.Audience;
import ru_omsu_fctk_simpleserver.essence.Group;
import ru_omsu_fctk_simpleserver.exception.ServiceException;
import ru_omsu_fctk_simpleserver.repositories.RepositoryAudience;
import ru_omsu_fctk_simpleserver.repositories.RepositoryGroup;
import ru_omsu_fctk_simpleserver.request.audience.GetAudiencesRequest;
import ru_omsu_fctk_simpleserver.request.group.GetStudentGroupsRequest;
import ru_omsu_fctk_simpleserver.response.audience.GetAudiencesResponse;
import ru_omsu_fctk_simpleserver.response.group.GetStudentGroupsResponse;

import java.util.ArrayList;
import java.util.List;

public class GetAudiencesService {
    private RepositoryAudience repositoryAudience;

    public GetAudiencesService(RepositoryAudience repositoryAudience) {
        this.repositoryAudience = repositoryAudience;
    }


    public GetAudiencesResponse getAudiences(GetAudiencesRequest request) throws ServiceException {
        try {
            List<String> numberList = new ArrayList<>();
            List<Integer> buildingNumberList = new ArrayList<>();
            for (Audience audience : repositoryAudience.getAudiences()) {
                numberList.add(audience.getNumber());
                buildingNumberList.add(audience.getBuildingNumber());
            }
            return new GetAudiencesResponse(numberList, buildingNumberList);
        } catch (Exception e) {
            throw new ServiceException(e.getMessage());
        }
    }



}
