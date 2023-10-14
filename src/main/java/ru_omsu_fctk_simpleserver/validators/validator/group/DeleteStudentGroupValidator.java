package ru_omsu_fctk_simpleserver.validators.validator.group;

import ru_omsu_fctk_simpleserver.validators.request.group.DeleteStudentGroupRequest;
import ru_omsu_fctk_simpleserver.validators.Validator;
import ru_omsu_fctk_simpleserver.validators.validator.primitive.ValidatorId;

import java.util.ArrayList;
import java.util.List;

public class DeleteStudentGroupValidator implements Validator<DeleteStudentGroupRequest> {
    private ValidatorId validatorId;

    @Override
    public List<String> validator(DeleteStudentGroupRequest request) {
        List<String> errors = new ArrayList<>();

        validatorId.validateIdNotZero(request.getId(), errors, "Id", "zero");

        return errors;
    }
}

