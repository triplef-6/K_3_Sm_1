package ru_omsu_fctk_simpleserver.validator.subject;

import ru_omsu_fctk_simpleserver.request.subject.AddSubjectRequest;
import ru_omsu_fctk_simpleserver.validator.Validator;
import ru_omsu_fctk_simpleserver.validator.primitive.ValidateString;

import java.util.ArrayList;
import java.util.List;

public class AddSubjectValidator implements Validator<AddSubjectRequest> {
    private ValidateString validateString;

    public AddSubjectValidator(ValidateString validateString) {
        this.validateString = validateString;
    }

    @Override
    public List<String> validator(AddSubjectRequest request) {

        List<String> errors = new ArrayList<>();
        validateString.validateStringNotEmpty(request.getName(), errors, "name", "empty");
        validateString.validateStringNotNull(request.getName(), errors, "name", "null");
        validateString.validateStringBig(request.getName(), errors, "name", "big", 20);

        validateString.validateStringNotEmpty(request.getShortName(), errors, "name", "empty");
        validateString.validateStringNotNull(request.getShortName(), errors, "name", "null");
        validateString.validateStringBig(request.getShortName(), errors, "name", "big", 20);

        return errors;
    }
}
