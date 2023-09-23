package validators.student;

import request.student.AddStudentRequest;
import validators.Validator;
import validators.primitive.ValidateString;
import validators.primitive.ValidatorId;

import java.util.ArrayList;
import java.util.List;

public class AddStudentValidator implements Validator<AddStudentRequest> {
    private ValidateString validateString;
    private ValidatorId validatorId;

    @Override
    public List<String> validator(AddStudentRequest request) {
        List<String> errors = new ArrayList<>();
        validateString.ValidateStringNotEmpty(request.getName(), errors, "name", "empty");
        validateString.ValidateStringNotNull(request.getName(), errors, "name", "null");
        validateString.ValidateStringBig(request.getName(), errors, "name", "big");
        validateString.ValidateStringNotEmpty(request.getSurname(), errors, "surname", "empty");
        validateString.ValidateStringNotNull(request.getSurname(), errors, "surname", "null");
        validateString.ValidateStringBig(request.getSurname(), errors, "surname", "big");
        validateString.ValidateStringNotEmpty(request.getPatronymic(), errors, "patronymic", "empty");
        validateString.ValidateStringNotNull(request.getPatronymic(), errors, "patronymic", "null");
        validateString.ValidateStringBig(request.getPatronymic(), errors, "patronymic", "big");
        validatorId.ValidateIdNotZero(request.getGroupId(), errors, "groupId", "zero");
        return errors;
    }
}
