package ru_omsu_fctk_simpleserver.exception;

public class ServerException extends Exception {
    public ServerException(String message) {
        super(message);
    }

    public ServerException(String message, Throwable cause) {
        super(message, cause);
    }
}
