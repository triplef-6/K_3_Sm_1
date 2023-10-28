package ru_omsu_fctk_simpleserver.validator.subject;

import ru_omsu_fctk_simpleserver.request.subject.EditSubjectRequest;
import ru_omsu_fctk_simpleserver.validator.Validator;
import ru_omsu_fctk_simpleserver.validator.primitive.ValidateString;
import ru_omsu_fctk_simpleserver.validator.primitive.ValidatorId;

import java.util.ArrayList;
import java.util.List;

public class EditSubjectValidator implements Validator<EditSubjectRequest> {
    private ValidateString validateString;
    private ValidatorId validatorId;

    @Override
    public List<String> validator(EditSubjectRequest request) {
        List<String> errors = new ArrayList<>();

        validateString.validateStringNotEmpty(request.getName(), errors, "name", "empty");
        validateString.validateStringNotNull(request.getName(), errors, "name", "null");
        validateString.validateStringBig(request.getName(), errors, "name", "big", 15);

        validatorId.validateIdNotZero(request.getId(), errors, "id", "zero");

        return errors;
    }
}