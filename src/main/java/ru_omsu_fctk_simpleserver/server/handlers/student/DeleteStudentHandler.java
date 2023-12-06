package ru_omsu_fctk_simpleserver.server.handlers.student;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru_omsu_fctk_simpleserver.controllers.ComonResponse;
import ru_omsu_fctk_simpleserver.controllers.ResponseEntity;
import ru_omsu_fctk_simpleserver.controllers.student.ControllerStudent;
import ru_omsu_fctk_simpleserver.exception.HandleException;
import ru_omsu_fctk_simpleserver.request.student.DeleteStudentRequest;
import ru_omsu_fctk_simpleserver.response.student.DeleteStudentResponse;
import ru_omsu_fctk_simpleserver.server.handlers.EndpointHandler;

public class DeleteStudentHandler implements EndpointHandler {
    private ControllerStudent controllerStudent;

    public DeleteStudentHandler(ControllerStudent controllerStudent) {
        this.controllerStudent = controllerStudent;
    }
    @Override
    public String handel(String json) throws HandleException {
        ObjectMapper mapper = new ObjectMapper();
        try {
            DeleteStudentRequest request = mapper.readValue(json, DeleteStudentRequest.class);
            ResponseEntity<ComonResponse<DeleteStudentResponse>> res = controllerStudent.deleteStudent(request);

            ComonResponse<DeleteStudentResponse> comonResponse = res.getAnswer();
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
