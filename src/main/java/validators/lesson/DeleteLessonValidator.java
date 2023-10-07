package validators.lesson;

import request.lesson.DeleteLessonRequest;
import validators.Validator;
import validators.primitive.ValidatorId;

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
