package ru_omsu_fctk_simpleserver.validator.subject;

import ru_omsu_fctk_simpleserver.request.subject.GetSubjectByIdRequest;
import ru_omsu_fctk_simpleserver.validator.Validator;
import ru_omsu_fctk_simpleserver.validator.primitive.ValidatorId;

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