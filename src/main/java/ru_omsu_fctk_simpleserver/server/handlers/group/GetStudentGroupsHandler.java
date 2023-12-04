package ru_omsu_fctk_simpleserver.server.handlers.group;

import ru_omsu_fctk_simpleserver.controllers.group.ControllerGroup;
import ru_omsu_fctk_simpleserver.server.handlers.EndpointHandler;

public class GetStudentGroupsHandler implements EndpointHandler {
    private ControllerGroup controllerGroup;

    public GetStudentGroupsHandler(ControllerGroup controllerGroup) {
        this.controllerGroup = controllerGroup;
    }

    @Override
    public String handel(String json) {
        return null;
    }
}
