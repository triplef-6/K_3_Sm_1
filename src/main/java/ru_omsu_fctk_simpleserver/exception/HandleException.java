package ru_omsu_fctk_simpleserver.exception;

public class HandleException extends Exception {
    public HandleException(String message) {
        super(message);
    }

    public HandleException(String message, Throwable cause) {
        super(message, cause);
    }
}
