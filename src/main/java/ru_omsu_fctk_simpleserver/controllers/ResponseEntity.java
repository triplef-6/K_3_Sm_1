package ru_omsu_fctk_simpleserver.controllers;

public class ResponseEntity<T> {
    private final T answer;
    private final int status;

    public ResponseEntity(T answer, int status) {
        this.answer = answer;
        this.status = status;
    }

    public T getAnswer() {
        return answer;
    }

    public int getStatus() {
        return status;
    }
}
