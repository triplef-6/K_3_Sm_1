package ru_omsu_fctk_simpleserver.validator.student;

import ru_omsu_fctk_simpleserver.Validator;
import ru_omsu_fctk_simpleserver.request.student.DeleteStudentRequest;
import ru_omsu_fctk_simpleserver.validator.primitive.ValidatorId;

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
