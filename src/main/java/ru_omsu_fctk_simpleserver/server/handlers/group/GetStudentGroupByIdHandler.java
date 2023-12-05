package ru_omsu_fctk_simpleserver.server.handlers.group;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru_omsu_fctk_simpleserver.controllers.ComonResponse;
import ru_omsu_fctk_simpleserver.controllers.ResponseEntity;
import ru_omsu_fctk_simpleserver.controllers.group.ControllerGroup;
import ru_omsu_fctk_simpleserver.exception.HandleException;
import ru_omsu_fctk_simpleserver.request.group.GetStudentGroupByIdRequest;
import ru_omsu_fctk_simpleserver.response.group.GetStudentGroupByIdResponse;
import ru_omsu_fctk_simpleserver.server.handlers.EndpointHandler;

public class GetStudentGroupByIdHandler implements EndpointHandler {
    private ControllerGroup controllerGroup;

    public GetStudentGroupByIdHandler(ControllerGroup controllerGroup) {
        this.controllerGroup = controllerGroup;
    }
    @Override
    public String handel(String json) throws HandleException {
        ObjectMapper mapper = new ObjectMapper();
        try {
            GetStudentGroupByIdRequest request = mapper.readValue(json, GetStudentGroupByIdRequest.class);
            ResponseEntity<ComonResponse<GetStudentGroupByIdResponse>> res = controllerGroup.getStudentGroupById(request);

            ComonResponse<GetStudentGroupByIdResponse> comonResponse = res.getAnswer();
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
