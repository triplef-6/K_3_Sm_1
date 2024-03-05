package ru_omsu_fctk_simpleserver.controllers;


import ru_omsu_fctk_simpleserver.request.subject.AddSubjectRequest;
import ru_omsu_fctk_simpleserver.request.subject.DeleteSubjectRequest;
import ru_omsu_fctk_simpleserver.response.subject.AddSubjectsResponse;
import ru_omsu_fctk_simpleserver.response.subject.DeleteSubjectResponse;
import ru_omsu_fctk_simpleserver.services.group.*;
import ru_omsu_fctk_simpleserver.services.subject.AddSubjectService;
import ru_omsu_fctk_simpleserver.services.subject.DeleteSubjectService;
import ru_omsu_fctk_simpleserver.validator.subject.AddSubjectValidator;
import ru_omsu_fctk_simpleserver.validator.subject.DeleteSubjectValidator;

import java.util.List;

public class ControllerSubject {
    private final AddSubjectService addSubjectService;
    private final DeleteSubjectService deleteSubjectService;
    private final AddSubjectValidator addSubjectValidator;
    private final DeleteSubjectValidator deleteSubjectValidator;


    public ControllerSubject(AddSubjectService addSubjectService,
                             DeleteSubjectService deleteSubjectService,
                             AddSubjectValidator addSubjectValidator,
                             DeleteSubjectValidator deleteSubjectValidator) {
        this.addSubjectService = addSubjectService;
        this.deleteSubjectService = deleteSubjectService;
        this.addSubjectValidator = addSubjectValidator;
        this.deleteSubjectValidator = deleteSubjectValidator;
    }

    public ResponseEntity<ComonResponse<AddSubjectsResponse>> addSubject(AddSubjectRequest request) {
        int status = 200;
        ComonResponse<AddSubjectsResponse> comonResponse;

        List<String> errors = addSubjectValidator.validator(request);

        if (errors.isEmpty()) {
            try {
                comonResponse = new ComonResponse<>(addSubjectService.addSubject(request));
            } catch (Exception exception) {
                status = 422;
                comonResponse = new ComonResponse<>(5, exception.getMessage(), errors);
            }
        } else {
            status = 400;
            comonResponse = new ComonResponse<>(5, "Validation error", errors);
        }

        return new ResponseEntity<>(comonResponse, status);
    }
    public ResponseEntity<ComonResponse<DeleteSubjectResponse>> deleteSubject(DeleteSubjectRequest request) {
        int status = 200;
        ComonResponse<DeleteSubjectResponse> comonResponse;

        List<String> errors = deleteSubjectValidator.validator(request);

        if (errors.isEmpty()) {
            try {
                comonResponse = new ComonResponse<>(deleteSubjectService.deleteSubject(request));
            } catch (Exception exception) {
                status = 422;
                comonResponse = new ComonResponse<>(5, exception.getMessage(), errors); // своё сообщение об ошибке
            }
        } else {
            status = 400;
            comonResponse = new ComonResponse<>(5, "Validation error", errors); // своё сообщение об ошибке
        }

        return new ResponseEntity<>(comonResponse, status);
    }











}
