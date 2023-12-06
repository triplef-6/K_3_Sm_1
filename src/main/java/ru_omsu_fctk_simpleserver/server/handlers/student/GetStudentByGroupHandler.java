package ru_omsu_fctk_simpleserver.server.handlers.student;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru_omsu_fctk_simpleserver.controllers.ComonResponse;
import ru_omsu_fctk_simpleserver.controllers.ResponseEntity;
import ru_omsu_fctk_simpleserver.controllers.student.ControllerStudent;
import ru_omsu_fctk_simpleserver.exception.HandleException;
import ru_omsu_fctk_simpleserver.request.student.GetStudentByGroupRequest;
import ru_omsu_fctk_simpleserver.response.student.GetStudentByGroupResponse;
import ru_omsu_fctk_simpleserver.server.handlers.EndpointHandler;

public class GetStudentByGroupHandler implements EndpointHandler {
    private ControllerStudent controllerStudent;

    public GetStudentByGroupHandler(ControllerStudent controllerStudent) {
        this.controllerStudent = controllerStudent;
    }
    @Override
    public String handel(String json) throws HandleException {
        ObjectMapper mapper = new ObjectMapper();
        try {
            GetStudentByGroupRequest request = mapper.readValue(json, GetStudentByGroupRequest.class);
            ResponseEntity<ComonResponse<GetStudentByGroupResponse>> res = controllerStudent.getStudentByGroup(request);

            ComonResponse<GetStudentByGroupResponse> comonResponse = res.getAnswer();
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
