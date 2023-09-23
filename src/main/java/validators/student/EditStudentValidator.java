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

        validateString.ValidateStringNotEmpty(request.getName(), errors, "name", "empty");
        validateString.ValidateStringNotNull(request.getName(), errors, "name", "null");
        validateString.ValidateStringBig(request.getName(), errors, "name", "big", 30);

        validateString.ValidateStringNotEmpty(request.getSurname(), errors, "surname", "empty");
        validateString.ValidateStringNotNull(request.getSurname(), errors, "surname", "null");
        validateString.ValidateStringBig(request.getSurname(), errors, "surname", "big", 30);

        validateString.ValidateStringNotEmpty(request.getPatronymic(), errors, "patronymic", "empty");
        validateString.ValidateStringNotNull(request.getPatronymic(), errors, "patronymic", "null");
        validateString.ValidateStringBig(request.getPatronymic(), errors, "patronymic", "big", 30);

        validatorId.ValidateIdNotZero(request.getId(), errors, "id", "zero");

        validatorId.ValidateIdNotZero(request.getGroupId(), errors, "groupId", "zero");

        return errors;

    }
}
