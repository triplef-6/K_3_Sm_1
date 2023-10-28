package ru_omsu_fctk_simpleserver.controllers;

public class ResponseEntity<T> {
    private T answer;
    private int status;

    public ResponseEntity(T answer, int status) {
        this.answer = answer;
        this.status = status;
    }

    public T getAnswer() {
        return answer;
    }

    public void setAnswer(T answer) {
        this.answer = answer;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
