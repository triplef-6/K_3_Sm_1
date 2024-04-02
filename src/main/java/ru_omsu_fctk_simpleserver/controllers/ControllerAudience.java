package ru_omsu_fctk_simpleserver.controllers;

import ru_omsu_fctk_simpleserver.request.audience.AddAudienceRequest;
import ru_omsu_fctk_simpleserver.request.audience.GetAudiencesRequest;
import ru_omsu_fctk_simpleserver.request.group.AddStudentGroupsRequest;
import ru_omsu_fctk_simpleserver.response.audience.AddAudienceResponse;
import ru_omsu_fctk_simpleserver.response.audience.GetAudiencesResponse;
import ru_omsu_fctk_simpleserver.response.group.AddStudentGroupsResponse;
import ru_omsu_fctk_simpleserver.services.audience.AddAudienceService;
import ru_omsu_fctk_simpleserver.services.audience.GetAudiencesService;
import ru_omsu_fctk_simpleserver.validator.audience.AddAudienceValidator;

import java.util.ArrayList;
import java.util.List;

public class ControllerAudience {
    private final AddAudienceService addAudiencesService;
    private final GetAudiencesService getAudiencesService;
    private final AddAudienceValidator addAudiencesValidator;

    public ControllerAudience(AddAudienceService addStudentGroupsService, GetAudiencesService getStudentGroupsService, AddAudienceValidator addStudentGroupsValidator) {
        this.addAudiencesService = addStudentGroupsService;
        this.getAudiencesService = getStudentGroupsService;
        this.addAudiencesValidator = addStudentGroupsValidator;
    }
    public ResponseEntity<ComonResponse<AddAudienceResponse>> addAudience(AddAudienceRequest request) {
        int status = 200;
        ComonResponse<AddAudienceResponse> comonResponse;

        List<String> errors = addAudiencesValidator.validator(request);

        if (errors.isEmpty()) {
            try {
                comonResponse = new ComonResponse<>(addAudiencesService.addAudience(request));
            } catch (Exception exception) {
                status = 422;
                comonResponse = new ComonResponse<>(6, exception.getMessage(), errors);
            }
        } else {
            status = 400;
            comonResponse = new ComonResponse<>(6, "Validation error", errors);
            //comonResponse = new ComonResponse<>(6, "Error", errors);
        }

        return new ResponseEntity<>(comonResponse, status);
    }
    public ResponseEntity<ComonResponse<GetAudiencesResponse>> getAudiences(GetAudiencesRequest request) {
        int status = 200;
        ComonResponse<GetAudiencesResponse> comonResponse;

            try {
                comonResponse = new ComonResponse<>(getAudiencesService.getAudiences(request));
            } catch (Exception exception) {
                status = 422;
                comonResponse = new ComonResponse<>(6, exception.getMessage(), new ArrayList<>());
            }

        return new ResponseEntity<>(comonResponse, status);
    }








}
