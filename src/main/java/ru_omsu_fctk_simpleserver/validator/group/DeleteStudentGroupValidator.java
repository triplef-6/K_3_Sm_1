package ru_omsu_fctk_simpleserver.validator.group;

import ru_omsu_fctk_simpleserver.validator.Validator;
import ru_omsu_fctk_simpleserver.request.group.DeleteStudentGroupRequest;
import ru_omsu_fctk_simpleserver.validator.primitive.ValidatorId;

import java.util.ArrayList;
import java.util.List;

public class DeleteStudentGroupValidator implements Validator<DeleteStudentGroupRequest> {
    private ValidatorId validatorId;

    public DeleteStudentGroupValidator(ValidatorId validatorId) {
        this.validatorId = validatorId;
    }

    @Override
    public List<String> validator(DeleteStudentGroupRequest request) {
        List<String> errors = new ArrayList<>();

        validatorId.validateIdNotZero(request.getId(), errors, "id", "zero");

        return errors;
    }
}

