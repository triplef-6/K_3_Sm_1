package ru_omsu_fctk_simpleserver.server.handlers.group;

import ru_omsu_fctk_simpleserver.controllers.group.ControllerGroup;
import ru_omsu_fctk_simpleserver.exception.HandleException;
import ru_omsu_fctk_simpleserver.server.handlers.EndpointHandler;

public class GetStudentGroupByIdHandler implements EndpointHandler {
    private ControllerGroup controllerGroup;

    public GetStudentGroupByIdHandler(ControllerGroup controllerGroup) {
        this.controllerGroup = controllerGroup;
    }
    @Override
    public String handel(String json) throws HandleException {
        return null;
    }
}
