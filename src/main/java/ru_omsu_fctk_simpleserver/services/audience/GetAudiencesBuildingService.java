package ru_omsu_fctk_simpleserver.services.audience;

import ru_omsu_fctk_simpleserver.essence.Audience;
import ru_omsu_fctk_simpleserver.exception.ServiceException;
import ru_omsu_fctk_simpleserver.repositories.RepositoryAudience;
import ru_omsu_fctk_simpleserver.request.audience.GetAudiencesBuildingRequest;
import ru_omsu_fctk_simpleserver.request.audience.GetAudiencesRequest;
import ru_omsu_fctk_simpleserver.response.audience.GetAudiencesBuildingResponse;
import ru_omsu_fctk_simpleserver.response.audience.GetAudiencesResponse;

import java.util.ArrayList;
import java.util.List;

public class GetAudiencesBuildingService {
    private RepositoryAudience repositoryAudience;

    public GetAudiencesBuildingService(RepositoryAudience repositoryAudience) {
        this.repositoryAudience = repositoryAudience;
    }


    public GetAudiencesBuildingResponse getAudiencesBuilding(GetAudiencesBuildingRequest request) throws ServiceException {
        try {
            List<String> numberList = new ArrayList<>();
            List<Integer> buildingNumberList = new ArrayList<>();
            for (Audience audience : repositoryAudience.getAudiencesBuilding(request.getBuildingNumber())) {
                numberList.add(audience.getNumber());
                buildingNumberList.add(audience.getBuildingNumber());
            }
            return new GetAudiencesBuildingResponse(numberList, buildingNumberList);
        } catch (Exception e) {
            throw new ServiceException(e.getMessage());
        }
    }
}

