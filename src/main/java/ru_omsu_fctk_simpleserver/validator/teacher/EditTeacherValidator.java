package ru_omsu_fctk_simpleserver.validator.teacher;

import ru_omsu_fctk_simpleserver.request.teacher.EditTeacherRequest;
import ru_omsu_fctk_simpleserver.Validator;
import ru_omsu_fctk_simpleserver.validator.primitive.ValidateString;
import ru_omsu_fctk_simpleserver.validator.primitive.ValidatorId;

import java.util.ArrayList;
import java.util.List;

public class EditTeacherValidator implements Validator<EditTeacherRequest> {
    private ValidateString validateString;
    private ValidatorId validatorId;

    @Override
    public List<String> validator(EditTeacherRequest request) {
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

        validatorId.validateIdNotZero(request.getId(), errors, "id", "zero");

        return errors;
    }
}
