package ru_omsu_fctk_simpleserver.validator.lesson;

import ru_omsu_fctk_simpleserver.request.lesson.GetLessonByIdRequest;
import ru_omsu_fctk_simpleserver.validator.Validator;
import ru_omsu_fctk_simpleserver.validator.primitive.ValidatorId;

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
