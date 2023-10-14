package ru_omsu_fctk_simpleserver.validators.validator.student;

import ru_omsu_fctk_simpleserver.validators.request.student.GetStudentByIdRequest;
import ru_omsu_fctk_simpleserver.validators.Validator;
import ru_omsu_fctk_simpleserver.validators.validator.primitive.ValidatorId;

import java.util.ArrayList;
import java.util.List;

public class GetStudentByIdValidator implements Validator< GetStudentByIdRequest> {
    private ValidatorId validatorId;

    @Override
    public List<String> validator( GetStudentByIdRequest request) {
        List<String> errors = new ArrayList<>();

        validatorId.validateIdNotZero(request.getId(), errors, "Id", "zero");

        return errors;
    }
}