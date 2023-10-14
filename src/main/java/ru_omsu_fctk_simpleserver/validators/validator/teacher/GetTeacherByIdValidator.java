package ru_omsu_fctk_simpleserver.validators.validator.teacher;

import ru_omsu_fctk_simpleserver.validators.request.teacher.GetTeacherByIdRequest;
import ru_omsu_fctk_simpleserver.validators.Validator;
import ru_omsu_fctk_simpleserver.validators.validator.primitive.ValidatorId;

import java.util.ArrayList;
import java.util.List;

public class GetTeacherByIdValidator implements Validator<GetTeacherByIdRequest> {
    private ValidatorId validatorId;

    @Override
    public List<String> validator(GetTeacherByIdRequest request) {
        List<String> errors = new ArrayList<>();

        validatorId.validateIdNotZero(request.getId(), errors, "Id", "zero");

        return errors;
    }
}
