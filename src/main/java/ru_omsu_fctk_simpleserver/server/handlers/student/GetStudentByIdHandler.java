package ru_omsu_fctk_simpleserver.server.handlers.student;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru_omsu_fctk_simpleserver.controllers.ComonResponse;
import ru_omsu_fctk_simpleserver.controllers.ResponseEntity;
import ru_omsu_fctk_simpleserver.controllers.student.ControllerStudent;
import ru_omsu_fctk_simpleserver.exception.HandleException;
import ru_omsu_fctk_simpleserver.request.student.GetStudentByIdRequest;
import ru_omsu_fctk_simpleserver.response.student.GetStudentByIdResponse;
import ru_omsu_fctk_simpleserver.server.handlers.EndpointHandler;

public class GetStudentByIdHandler implements EndpointHandler {
    private ControllerStudent controllerStudent;

    public GetStudentByIdHandler(ControllerStudent controllerStudent) {
        this.controllerStudent = controllerStudent;
    }
    @Override
    public String handel(String json) throws HandleException {
        ObjectMapper mapper = new ObjectMapper();
        try {
            GetStudentByIdRequest request = mapper.readValue(json, GetStudentByIdRequest.class);
            ResponseEntity<ComonResponse<GetStudentByIdResponse>> res = controllerStudent.getStudentById(request);

            ComonResponse<GetStudentByIdResponse> comonResponse = res.getAnswer();
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
