package validators.student;

import request.student.EditStudentRequest;
import validators.Validator;
import validators.primitive.ValidateString;
import validators.primitive.ValidatorId;

import java.util.ArrayList;
import java.util.List;

public class EditStudentValidator implements Validator<EditStudentRequest> {
    private ValidateString validateString;
    private ValidatorId validatorId;

    @Override
    public List<String> validator(EditStudentRequest request) {
        List<String> errors = new ArrayList<>();

        validateString.validateStringNotEmpty(request.getName(), errors, "name", "empty");
        validateString.validateStringNotNull(request.getName(), errors, "name", "null");
        validateString.validateStringBig(request.getName(), errors, "name", "big", 30);

        validateString.validateStringNotEmpty(request.getSurname(), errors, "surname", "empty");
        validateString.validateStringNotNull(request.getSurname(), errors, "surname", "null");
        validateString.validateStringBig(request.getSurname(), errors, "surname", "big", 30);

        validateString.validateStringNotEmpty(request.getPatronymic(), errors, "patronymic", "empty");
        validateString.validateStringNotNull(request.getPatronymic(), errors, "patronymic", "null");
        validateString.validateStringBig(request.getPatronymic(), errors, "patronymic", "big", 30);

        validateString.validateStringNotEmpty(request.getStatus(), errors, "status", "empty");
        validateString.validateStringNotNull(request.getStatus(), errors, "status", "null");
        validateString.validateStringStatus(request.getStatus(), errors, "status", "no");

        validatorId.validateIdNotZero(request.getId(), errors, "id", "zero");

        validatorId.validateIdNotZero(request.getGroupId(), errors, "groupId", "zero");

        return errors;

    }
}
