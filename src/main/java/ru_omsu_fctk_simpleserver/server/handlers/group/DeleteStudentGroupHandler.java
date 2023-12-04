package ru_omsu_fctk_simpleserver.server.handlers.group;

import ru_omsu_fctk_simpleserver.controllers.group.ControllerGroup;
import ru_omsu_fctk_simpleserver.exception.HandleException;
import ru_omsu_fctk_simpleserver.server.handlers.EndpointHandler;

public class DeleteStudentGroupHandler implements EndpointHandler {
    private ControllerGroup controllerGroup;

    public DeleteStudentGroupHandler(ControllerGroup controllerGroup) {
        this.controllerGroup = controllerGroup;
    }
    @Override
    public String handel(String json) throws HandleException {
        return null;
    }
}
