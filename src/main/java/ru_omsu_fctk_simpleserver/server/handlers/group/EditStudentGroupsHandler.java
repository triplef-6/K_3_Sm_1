package ru_omsu_fctk_simpleserver.server.handlers.group;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru_omsu_fctk_simpleserver.controllers.ComonResponse;
import ru_omsu_fctk_simpleserver.controllers.ResponseEntity;
import ru_omsu_fctk_simpleserver.controllers.group.ControllerGroup;
import ru_omsu_fctk_simpleserver.exception.HandleException;
import ru_omsu_fctk_simpleserver.request.group.EditStudentGroupsRequest;
import ru_omsu_fctk_simpleserver.response.group.EditStudentGroupsResponse;
import ru_omsu_fctk_simpleserver.server.handlers.EndpointHandler;

public class EditStudentGroupsHandler implements EndpointHandler {
    private ControllerGroup controllerGroup;

    public EditStudentGroupsHandler(ControllerGroup controllerGroup) {
        this.controllerGroup = controllerGroup;
    }
    @Override
    public String handel(String json) throws HandleException {
        ObjectMapper mapper = new ObjectMapper();
        try {
            EditStudentGroupsRequest request = mapper.readValue(json, EditStudentGroupsRequest.class);
            ResponseEntity<ComonResponse<EditStudentGroupsResponse>> res = controllerGroup.editStudentGroups(request);

            ComonResponse<EditStudentGroupsResponse> comonResponse = res.getAnswer();
            if (comonResponse.isOk()) {
                return mapper.writeValueAsString(res.getStatus()) + "::";
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
