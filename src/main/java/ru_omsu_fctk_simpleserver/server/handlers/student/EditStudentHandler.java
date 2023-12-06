package ru_omsu_fctk_simpleserver.server.handlers.student;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru_omsu_fctk_simpleserver.controllers.ComonResponse;
import ru_omsu_fctk_simpleserver.controllers.ResponseEntity;
import ru_omsu_fctk_simpleserver.controllers.student.ControllerStudent;
import ru_omsu_fctk_simpleserver.exception.HandleException;
import ru_omsu_fctk_simpleserver.request.student.EditStudentRequest;
import ru_omsu_fctk_simpleserver.response.student.EditStudentResponse;
import ru_omsu_fctk_simpleserver.server.handlers.EndpointHandler;

public class EditStudentHandler implements EndpointHandler {
    private ControllerStudent controllerStudent;

    public EditStudentHandler(ControllerStudent controllerStudent) {
        this.controllerStudent = controllerStudent;
    }
    @Override
    public String handel(String json) throws HandleException {
        ObjectMapper mapper = new ObjectMapper();
        try {
            EditStudentRequest request = mapper.readValue(json, EditStudentRequest.class);
            ResponseEntity<ComonResponse<EditStudentResponse>> res = controllerStudent.editStudent(request);

            ComonResponse<EditStudentResponse> comonResponse = res.getAnswer();
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
