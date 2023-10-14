package ru_omsu_fctk_simpleserver.validators.validator.lesson;

import ru_omsu_fctk_simpleserver.validators.request.lesson.GetLessonByIdRequest;
import ru_omsu_fctk_simpleserver.validators.Validator;
import ru_omsu_fctk_simpleserver.validators.validator.primitive.ValidatorId;

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
