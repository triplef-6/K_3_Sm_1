package ru_omsu_fctk_simpleserver.server.handlers.student;

import ru_omsu_fctk_simpleserver.controllers.group.ControllerGroup;
import ru_omsu_fctk_simpleserver.controllers.student.ControllerStudent;
import ru_omsu_fctk_simpleserver.exception.HandleException;
import ru_omsu_fctk_simpleserver.server.handlers.EndpointHandler;

public class AddStudentHandler implements EndpointHandler {
    private ControllerStudent controllerStudent;

    public AddStudentHandler(ControllerStudent controllerStudent) {
        this.controllerStudent = controllerStudent;
    }
    @Override
    public String handel(String json) throws HandleException {
        return null;
    }
}
