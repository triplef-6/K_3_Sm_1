package validators.student;

import request.student.DeleteStudentRequest;
import validators.Validator;
import validators.primitive.ValidatorId;

import java.util.ArrayList;
import java.util.List;

public class DeleteStudentValidator implements Validator<DeleteStudentRequest> {
    private ValidatorId validatorId;

    @Override
    public List<String> validator(DeleteStudentRequest request) {
        List<String> errors = new ArrayList<>();

        validatorId.ValidateIdNotZero(request.getId(), errors, "Id", "zero");

        return errors;
    }
}
