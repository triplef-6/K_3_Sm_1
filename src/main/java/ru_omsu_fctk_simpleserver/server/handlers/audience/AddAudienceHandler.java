package ru_omsu_fctk_simpleserver.server.handlers.audience;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru_omsu_fctk_simpleserver.controllers.ComonResponse;
import ru_omsu_fctk_simpleserver.controllers.ControllerAudience;
import ru_omsu_fctk_simpleserver.controllers.ResponseEntity;
import ru_omsu_fctk_simpleserver.controllers.group.ControllerGroup;
import ru_omsu_fctk_simpleserver.exception.HandleException;
import ru_omsu_fctk_simpleserver.request.audience.AddAudienceRequest;
import ru_omsu_fctk_simpleserver.request.group.AddStudentGroupsRequest;
import ru_omsu_fctk_simpleserver.response.audience.AddAudienceResponse;
import ru_omsu_fctk_simpleserver.response.group.AddStudentGroupsResponse;
import ru_omsu_fctk_simpleserver.server.handlers.EndpointHandler;

public class AddAudienceHandler implements EndpointHandler {
    private ControllerAudience controllerAudience;

    public AddAudienceHandler(ControllerAudience controllerAudience) {
        this.controllerAudience = controllerAudience;
    }

    @Override
    public String handel(String json) throws HandleException {
        ObjectMapper mapper = new ObjectMapper();
        try {
            AddAudienceRequest request = mapper.readValue(json, AddAudienceRequest.class);
            ResponseEntity<ComonResponse<AddAudienceResponse>> res = controllerAudience.addAudience(request);

            ComonResponse<AddAudienceResponse> comonResponse = res.getAnswer();
            if (comonResponse.isOk()) {
                return mapper.writeValueAsString(res.getStatus()) + "::"
                        + mapper.writeValueAsString(comonResponse.getData());
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