package validators.student;

import request.student.GetStudentByGroupRequest;
import validators.Validator;
import validators.primitive.ValidatorId;

import java.util.ArrayList;
import java.util.List;

public class GetStudentByGroupValidator implements Validator<GetStudentByGroupRequest> {
    private ValidatorId validatorId;

    @Override
    public List<String> validator(GetStudentByGroupRequest request) {
        List<String> errors = new ArrayList<>();
        validatorId.ValidateIdNotZero(request.getId(), errors, "Id", "zero");
        return errors;
    }
}
