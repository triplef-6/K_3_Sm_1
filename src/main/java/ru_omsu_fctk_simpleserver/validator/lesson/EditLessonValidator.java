package ru_omsu_fctk_simpleserver.validator.lesson;

import ru_omsu_fctk_simpleserver.request.lesson.EditLessonRequest;
import ru_omsu_fctk_simpleserver.validator.primitive.ValidateDate;
import ru_omsu_fctk_simpleserver.validator.Validator;
import ru_omsu_fctk_simpleserver.validator.primitive.ValidateString;
import ru_omsu_fctk_simpleserver.validator.primitive.ValidatorId;

import java.util.ArrayList;
import java.util.List;

public class EditLessonValidator implements Validator<EditLessonRequest> {
    private ValidateString validateString;
    private ValidateDate validateDate;
    private ValidatorId validatorId;


    @Override
    public List<String> validator(EditLessonRequest request) {
        List<String> errors = new ArrayList<>();

        validateString.validateStringNotEmpty(request.getGroupId(), errors, "groupId", "empty");
        validateString.validateStringNotNull(request.getGroupId(), errors, "groupId", "null");
        validateString.validateStringInt(request.getGroupId(), errors, "groupId", "no id");

        validateString.validateStringNotEmpty(request.getTeacherId(), errors, "teacherId", "empty");
        validateString.validateStringNotNull(request.getTeacherId(), errors, "teacherId", "null");
        validateString.validateStringInt(request.getTeacherId(), errors, "teacherId", "no id");

        validateString.validateStringNotEmpty(request.getTime(), errors, "time", "empty");
        validateString.validateStringNotNull(request.getTime(), errors, "time", "null");
        validateString.validateStringInt(request.getTime(), errors, "time", "no time");

        validateString.validateStringNotEmpty(request.getData(), errors, "date", "empty");
        validateString.validateStringNotNull(request.getData(), errors, "date", "null");
        validateDate.validateStringDate(request.getData(), errors, "date", "no date");

        validatorId.validateIdNotZero(request.getId(), errors, "id", "zero");

        return errors;
    }
}
