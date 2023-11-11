package ru_omsu_fctk_simpleserver.controllers.student;

import ru_omsu_fctk_simpleserver.controllers.ComonResponse;
import ru_omsu_fctk_simpleserver.controllers.ResponseEntity;
import ru_omsu_fctk_simpleserver.request.student.*;
import ru_omsu_fctk_simpleserver.response.student.*;
import ru_omsu_fctk_simpleserver.validator.student.*;

import java.util.List;

public class ControllerStudent {
    private AddStudentValidator addStudentValidator;
    private EditStudentValidator editStudentValidator;
    private DeleteStudentValidator deleteStudentValidator;
    private GetStudentByIdValidator getStudentByIdValidator;
    private GetStudentByGroupValidator getStudentByGroupValidator;

    public ResponseEntity<ComonResponse<AddStudentResponse>> addStudent(AddStudentRequest request) {
        int status = 200;
        ComonResponse<AddStudentResponse> comonResponse;

        List<String> errors = addStudentValidator.validator(request);

        if (errors.isEmpty()) {
            try {
                AddStudentService service = new AddStudentService(request);
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

    public ResponseEntity<ComonResponse<EditStudentResponse>> editStudentGroups(EditStudentRequest request) {
        int status = 200;
        ComonResponse<EditStudentResponse> comonResponse;

        List<String> errors = editStudentValidator.validator(request);

        if (errors.isEmpty()) {
            try {
                EditStudentService service = new EditStudentService(request);
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

    public ResponseEntity<ComonResponse<DeleteStudentResponse>> deleteStudentGroup(DeleteStudentRequest request) {
        int status = 200;
        ComonResponse<DeleteStudentResponse> comonResponse;

        List<String> errors = deleteStudentValidator.validator(request);

        if (errors.isEmpty()) {
            try {
                DeleteStudentService service = new DeleteStudentService(request);
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

    public ResponseEntity<ComonResponse<GetStudentByIdResponse>> getStudentById(GetStudentByIdRequest request) {
        int status = 200;
        ComonResponse<GetStudentByIdResponse> comonResponse;

        List<String> errors = getStudentByIdValidator.validator(request);

        if (errors.isEmpty()) {
            try {
                GetStudentByIdService service = new GetStudentByIdService(request);
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

    public ResponseEntity<ComonResponse<GetStudentByGroupResponse>> getStudentById(GetStudentByGroupRequest request) {
        int status = 200;
        ComonResponse<GetStudentByGroupResponse> comonResponse;

        List<String> errors = getStudentByGroupValidator.validator(request);

        if (errors.isEmpty()) {
            try {
                GetStudentByGroupService service = new GetStudentByGroupService(request);
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
