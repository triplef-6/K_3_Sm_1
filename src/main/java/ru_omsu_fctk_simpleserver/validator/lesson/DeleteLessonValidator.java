package ru_omsu_fctk_simpleserver.validator.lesson;

import ru_omsu_fctk_simpleserver.request.lesson.DeleteLessonRequest;
import ru_omsu_fctk_simpleserver.Validator;
import ru_omsu_fctk_simpleserver.validator.primitive.ValidatorId;

import java.util.ArrayList;
import java.util.List;

public class DeleteLessonValidator implements Validator<DeleteLessonRequest> {
    private ValidatorId validatorId;

    @Override
    public List<String> validator(DeleteLessonRequest request) {
        List<String> errors = new ArrayList<>();

        validatorId.validateIdNotZero(request.getId(), errors, "Id", "zero");

        return errors;
    }
}
