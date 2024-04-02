package ru_omsu_fctk_simpleserver.server.handlers.audience;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru_omsu_fctk_simpleserver.controllers.ComonResponse;
import ru_omsu_fctk_simpleserver.controllers.ControllerAudience;
import ru_omsu_fctk_simpleserver.controllers.ResponseEntity;
import ru_omsu_fctk_simpleserver.controllers.group.ControllerGroup;
import ru_omsu_fctk_simpleserver.exception.HandleException;
import ru_omsu_fctk_simpleserver.request.audience.GetAudiencesRequest;
import ru_omsu_fctk_simpleserver.request.group.GetStudentGroupsRequest;
import ru_omsu_fctk_simpleserver.response.audience.GetAudiencesResponse;
import ru_omsu_fctk_simpleserver.response.group.GetStudentGroupsResponse;
import ru_omsu_fctk_simpleserver.server.handlers.EndpointHandler;

public class GetAudiencesHandler implements EndpointHandler {
    private ControllerAudience controllerAudiences;

    public GetAudiencesHandler(ControllerAudience controllerAudiences) {
        this.controllerAudiences = controllerAudiences;
    }

    @Override
    public String handel(String json) throws HandleException {
        ObjectMapper mapper = new ObjectMapper();
        try {
            GetAudiencesRequest request = new GetAudiencesRequest();
            ResponseEntity<ComonResponse<GetAudiencesResponse>> res = controllerAudiences.getAudiences(request);

            ComonResponse<GetAudiencesResponse> comonResponse = res.getAnswer();
            if (comonResponse.isOk()) {
                return mapper.writeValueAsString(res.getStatus()) + "::" + mapper.writeValueAsString(comonResponse.getData());
            } else {
                return mapper.writeValueAsString(res.getStatus()) + "::"
                        + mapper.writeValueAsString(comonResponse.getCodeError()) + ":"
                        + mapper.writeValueAsString(comonResponse.getMessageError()) + ":"
                        + mapper.writeValueAsString(comonResponse.getDetails());
            }
        } catch (Exception e) {
            throw new HandleException(e.getMessage());
        }
    }
}