package ru_omsu_fctk_simpleserver.validator.teacher;

import ru_omsu_fctk_simpleserver.request.teacher.DeleteTeacherRequest;
import ru_omsu_fctk_simpleserver.validator.Validator;
import ru_omsu_fctk_simpleserver.validator.primitive.ValidatorId;

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
