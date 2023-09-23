package validators.group;

import request.group.GetStudentGroupByIdRequest;
import validators.primitive.ValidatorId;
import validators.Validator;

import java.util.ArrayList;
import java.util.List;

public class GetStudentGroupByldValidator implements Validator<GetStudentGroupByIdRequest> {
    private ValidatorId validatorId;

    @Override
    public List<String> validator(GetStudentGroupByIdRequest request) {
        List<String> errors = new ArrayList<>();

        validatorId.validateIdNotZero(request.getId(), errors, "id", "zero");

        return errors;
    }
}
