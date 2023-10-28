package ru_omsu_fctk_simpleserver.validator.teacher;

import ru_omsu_fctk_simpleserver.request.teacher.GetTeacherByIdRequest;
import ru_omsu_fctk_simpleserver.validator.Validator;
import ru_omsu_fctk_simpleserver.validator.primitive.ValidatorId;

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
