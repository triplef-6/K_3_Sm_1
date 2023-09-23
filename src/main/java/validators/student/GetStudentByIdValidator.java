package validators.student;

import request.student.GetStudentByIdRequest;
import validators.Validator;
import validators.primitive.ValidatorId;

import java.util.ArrayList;
import java.util.List;

public class GetStudentByIdValidator implements Validator< GetStudentByIdRequest> {
    private ValidatorId validatorId;

    @Override
    public List<String> validator( GetStudentByIdRequest request) {
        List<String> errors = new ArrayList<>();
        validatorId.ValidateIdNotZero(request.getId(), errors, "Id", "zero");
        return errors;
    }
}