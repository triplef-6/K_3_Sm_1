package ru_omsu_fctk_simpleserver.validators.validator.teacher;

import ru_omsu_fctk_simpleserver.validators.request.teacher.DeleteTeacherRequest;
import ru_omsu_fctk_simpleserver.validators.Validator;
import ru_omsu_fctk_simpleserver.validators.validator.primitive.ValidatorId;

import java.util.ArrayList;
import java.util.List;

public class DeleteTeacherValidator implements Validator<DeleteTeacherRequest> {
    private ValidatorId validatorId;

    @Override
    public List<String> validator(DeleteTeacherRequest request) {
        List<String> errors = new ArrayList<>();

        validatorId.validateIdNotZero(request.getId(), errors, "Id", "zero");

        return errors;
    }
}
