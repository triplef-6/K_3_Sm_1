package ru_omsu_fctk_simpleserver.server.handlers.subject;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru_omsu_fctk_simpleserver.controllers.ComonResponse;
import ru_omsu_fctk_simpleserver.controllers.ControllerSubject;
import ru_omsu_fctk_simpleserver.controllers.ResponseEntity;
import ru_omsu_fctk_simpleserver.exception.HandleException;
import ru_omsu_fctk_simpleserver.request.subject.AddSubjectRequest;
import ru_omsu_fctk_simpleserver.response.subject.AddSubjectsResponse;

public class AddSubjectHandler {
    private ControllerSubject controllerSubject;

    public AddSubjectHandler(ControllerSubject controllerSubject) {
        this.controllerSubject = controllerSubject;
    }

    public String handel(String json) throws HandleException {
        ObjectMapper mapper = new ObjectMapper();
        try {
            AddSubjectRequest request = mapper.readValue(json, AddSubjectRequest.class);
            ResponseEntity<ComonResponse<AddSubjectsResponse>> res = controllerSubject.addSubject(request);

            ComonResponse<AddSubjectsResponse> comonResponse = res.getAnswer();
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
