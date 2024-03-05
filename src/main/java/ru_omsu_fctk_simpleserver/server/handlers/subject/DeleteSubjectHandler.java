package ru_omsu_fctk_simpleserver.server.handlers.subject;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru_omsu_fctk_simpleserver.controllers.ComonResponse;
import ru_omsu_fctk_simpleserver.controllers.ControllerSubject;
import ru_omsu_fctk_simpleserver.controllers.ResponseEntity;
import ru_omsu_fctk_simpleserver.controllers.group.ControllerGroup;
import ru_omsu_fctk_simpleserver.exception.HandleException;
import ru_omsu_fctk_simpleserver.request.subject.DeleteSubjectRequest;
import ru_omsu_fctk_simpleserver.response.subject.DeleteSubjectResponse;
import ru_omsu_fctk_simpleserver.server.handlers.EndpointHandler;

public class DeleteSubjectHandler implements EndpointHandler {
    private ControllerSubject controllerSubject;

    public DeleteSubjectHandler(ControllerSubject controllerSubject) {
        this.controllerSubject = controllerSubject;
    }

    @Override
    public String handel(String json) throws HandleException {
        ObjectMapper mapper = new ObjectMapper();
        try {
            DeleteSubjectRequest request = mapper.readValue(json, DeleteSubjectRequest.class);
            ResponseEntity<ComonResponse<DeleteSubjectResponse>> res = controllerSubject.deleteSubject(request);

            ComonResponse<DeleteSubjectResponse> comonResponse = res.getAnswer();
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
