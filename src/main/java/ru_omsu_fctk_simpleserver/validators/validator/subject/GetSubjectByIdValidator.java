package ru_omsu_fctk_simpleserver.validators.validator.subject;

import ru_omsu_fctk_simpleserver.validators.request.subject.GetSubjectByIdRequest;
import ru_omsu_fctk_simpleserver.validators.Validator;
import ru_omsu_fctk_simpleserver.validators.validator.primitive.ValidatorId;

import java.util.ArrayList;
import java.util.List;

public class GetSubjectByIdValidator implements Validator<GetSubjectByIdRequest> {
    private ValidatorId validatorId;

    @Override
    public List<String> validator(GetSubjectByIdRequest request) {
        List<String> errors = new ArrayList<>();

        validatorId.validateIdNotZero(request.getId(), errors, "id", "zero");

        return errors;
    }
}