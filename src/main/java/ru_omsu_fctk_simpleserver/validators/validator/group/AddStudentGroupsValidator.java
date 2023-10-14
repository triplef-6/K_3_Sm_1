package ru_omsu_fctk_simpleserver.validators.validator.group;

import ru_omsu_fctk_simpleserver.validators.request.group.AddStudentGroupsRequest;
import ru_omsu_fctk_simpleserver.validators.validator.primitive.ValidateString;
import ru_omsu_fctk_simpleserver.validators.Validator;

import java.util.ArrayList;
import java.util.List;

public class AddStudentGroupsValidator implements Validator<AddStudentGroupsRequest> {
    private ValidateString validateString;

    @Override
    public List<String> validator(AddStudentGroupsRequest request) {

        List<String> errors = new ArrayList<>();
        validateString.validateStringNotEmpty(request.getName(), errors, "name", "empty");
        validateString.validateStringNotNull(request.getName(), errors, "name", "null");
        validateString.validateStringBig(request.getName(), errors, "name", "big", 15);

        return errors;
    }
}
