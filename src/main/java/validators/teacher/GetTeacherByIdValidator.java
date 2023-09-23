package validators.teacher;

import request.student.GetStudentByIdRequest;
import request.teacher.GetTeacherByIdRequest;
import validators.Validator;
import validators.primitive.ValidatorId;

import java.util.ArrayList;
import java.util.List;

public class GetTeacherByIdValidator implements Validator<GetTeacherByIdRequest> {
    private ValidatorId validatorId;

    @Override
    public List<String> validator(GetTeacherByIdRequest request) {
        List<String> errors = new ArrayList<>();

        validatorId.validateIdNotZero(request.getId(), errors, "Id", "zero");

        return errors;
    }
}
