package validators.lesson;

import request.lesson.GetLessonByIdRequest;
import validators.Validator;
import validators.primitive.ValidatorId;

import java.util.ArrayList;
import java.util.List;

public class GetLessonByIdValidator implements Validator<GetLessonByIdRequest> {
    private ValidatorId validatorId;

    @Override
    public List<String> validator(GetLessonByIdRequest request) {
        List<String> errors = new ArrayList<>();

        validatorId.validateIdNotZero(request.getId(), errors, "id", "zero");

        return errors;
    }
}
