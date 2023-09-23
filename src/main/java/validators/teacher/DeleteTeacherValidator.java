package validators.teacher;

import request.student.DeleteStudentRequest;
import request.teacher.DeleteTeacherRequest;
import validators.Validator;
import validators.primitive.ValidatorId;

import java.util.ArrayList;
import java.util.List;

public class DeleteTeacherValidator implements Validator<DeleteTeacherRequest> {
    private ValidatorId validatorId;

    @Override
    public List<String> validator(DeleteTeacherRequest request) {
        List<String> errors = new ArrayList<>();

        validatorId.validateIdNotZero(request.getId(), errors, "Id", "zero");

        return errors;
    }
}
