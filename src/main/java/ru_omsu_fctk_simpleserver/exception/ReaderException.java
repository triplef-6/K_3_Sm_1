package ru_omsu_fctk_simpleserver.exception;

public class ReaderException extends Exception {
    public ReaderException(String message) {
        super(message);
    }

    public ReaderException(String message, Throwable cause) {
        super(message, cause);
    }
}
