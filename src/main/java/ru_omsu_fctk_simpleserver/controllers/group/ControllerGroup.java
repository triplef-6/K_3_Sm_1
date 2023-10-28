package ru_omsu_fctk_simpleserver.controllers.group;

import ru_omsu_fctk_simpleserver.controllers.ComonResponse;
import ru_omsu_fctk_simpleserver.controllers.ResponseEntity;
import ru_omsu_fctk_simpleserver.request.group.AddStudentGroupsRequest;
import ru_omsu_fctk_simpleserver.response.group.AddStudentGroupsResponse;
import ru_omsu_fctk_simpleserver.validator.group.AddStudentGroupsValidator;

import java.util.List;

public class ControllerGroup {
    private AddStudentGroupsValidator addStudentGroupsValidator;

    public ResponseEntity<ComonResponse<AddStudentGroupsResponse>> addStudentGroups(AddStudentGroupsRequest request) {
        int status = 200;
        ComonResponse<AddStudentGroupsResponse> comonResponse;

        List<String> errors = addStudentGroupsValidator.validator(request);

        if (errors.isEmpty()) {
            try {
                AddStudentGroupsService service = new AddStudentGroupsService(request);
                comonResponse = new ComonResponse<>(service.answer());
            } catch (Exception exception) {
                status = 422;
                comonResponse = new ComonResponse<>(6, "Error", errors); // своё сообщение об ошибке
            }
        } else {
            status = 400;
            comonResponse = new ComonResponse<>(6, "Error", errors); // своё сообщение об ошибке
        }

        return new ResponseEntity<>(comonResponse, status);
    }






}
