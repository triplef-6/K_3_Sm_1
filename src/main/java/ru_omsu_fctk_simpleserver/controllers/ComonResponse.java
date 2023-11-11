package ru_omsu_fctk_simpleserver.controllers;

import java.util.List;

public class ComonResponse<T> {
    private T data;
    private boolean ok;
    private Integer codeError;
    private String messageError;
    private List<String> details;

    public ComonResponse(T data) {
        this.data = data;
        ok = true;
        codeError = null;
        messageError = null;
        details = null;
    }

    public ComonResponse(Integer codeError, String messageError, List<String> details) {
        data = null;
        ok = false;
        this.codeError = codeError;
        this.messageError = messageError;
        this.details = details;
    }








}
