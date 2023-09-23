package validators.group;

import request.group.AddStudentGroupsRequest;
import validators.primitive.ValidateString;
import validators.Validator;

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
