package validators.lesson;

import request.lesson.EditLessonRequest;
import validators.Validator;
import validators.primitive.ValidateDate;
import validators.primitive.ValidateString;
import validators.primitive.ValidatorId;

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
