package ru_omsu_fctk_simpleserver.validators.validator.group;

import ru_omsu_fctk_simpleserver.validators.request.group.GetStudentGroupByIdRequest;
import ru_omsu_fctk_simpleserver.validators.Validator;
import ru_omsu_fctk_simpleserver.validators.validator.primitive.ValidatorId;

import java.util.ArrayList;
import java.util.List;

public class GetStudentGroupByIdValidator implements Validator<GetStudentGroupByIdRequest> {
    private ValidatorId validatorId;

    @Override
    public List<String> validator(GetStudentGroupByIdRequest request) {
        List<String> errors = new ArrayList<>();

        validatorId.validateIdNotZero(request.getId(), errors, "id", "zero");

        return errors;
    }
}
