package ru_omsu_fctk_simpleserver.validator.group;

import ru_omsu_fctk_simpleserver.validator.Validator;
import ru_omsu_fctk_simpleserver.request.group.GetStudentGroupByIdRequest;
import ru_omsu_fctk_simpleserver.validator.primitive.ValidatorId;

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
