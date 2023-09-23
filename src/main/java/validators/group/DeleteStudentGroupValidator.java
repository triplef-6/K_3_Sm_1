package validators.group;

import request.group.DeleteStudentGroupRequest;
import validators.Validator;
import validators.primitive.ValidatorId;

import java.util.ArrayList;
import java.util.List;

public class DeleteStudentGroupValidator implements Validator<DeleteStudentGroupRequest> {
    private ValidatorId validatorId;

    @Override
    public List<String> validator(DeleteStudentGroupRequest request) {
        List<String> errors = new ArrayList<>();
        validatorId.ValidateIdNotZero(request.getId(), errors, "Id", "zero");
        return errors;
    }
}

