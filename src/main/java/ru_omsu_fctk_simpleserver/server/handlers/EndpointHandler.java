package ru_omsu_fctk_simpleserver.server.handlers;

import ru_omsu_fctk_simpleserver.exception.HandleException;

public interface EndpointHandler {
    String handel(String json) throws HandleException;
}
