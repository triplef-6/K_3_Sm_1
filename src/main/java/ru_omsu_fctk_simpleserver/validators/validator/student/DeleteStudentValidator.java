package ru_omsu_fctk_simpleserver.validators.validator.student;

import ru_omsu_fctk_simpleserver.validators.request.student.DeleteStudentRequest;
import ru_omsu_fctk_simpleserver.validators.Validator;
import ru_omsu_fctk_simpleserver.validators.validator.primitive.ValidatorId;

import java.util.ArrayList;
import java.util.List;

public class DeleteStudentValidator implements Validator<DeleteStudentRequest> {
    private ValidatorId validatorId;

    @Override
    public List<String> validator(DeleteStudentRequest request) {
        List<String> errors = new ArrayList<>();

        validatorId.validateIdNotZero(request.getId(), errors, "Id", "zero");

        return errors;
    }
}
