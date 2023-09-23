package validators.group;

import request.group.EditStudentGroupsRequest;
import validators.primitive.ValidateString;
import validators.primitive.ValidatorId;
import validators.Validator;

import java.util.ArrayList;
import java.util.List;

public class EditStudentGroupsValidator implements Validator<EditStudentGroupsRequest> {
    private ValidateString validateString;
    private ValidatorId validatorId;

    @Override
    public List<String> validator(EditStudentGroupsRequest request) {
        List<String> errors = new ArrayList<>();

        validateString.ValidateStringNotEmpty(request.getName(), errors, "name", "empty");
        validateString.ValidateStringNotNull(request.getName(), errors, "name", "null");
        validateString.ValidateStringBig(request.getName(), errors, "name", "big", 15);

        validatorId.ValidateIdNotZero(request.getId(), errors, "id", "zero");

        return errors;
    }
}
