package validators.group;

import request.group.GetStudentGroupByldRequest;
import validators.primitive.ValidatorId;
import validators.Validator;

import java.util.ArrayList;
import java.util.List;

public class GetStudentGroupByldValidator implements Validator<GetStudentGroupByldRequest> {
    private ValidatorId validatorId;

    @Override
    public List<String> validator(GetStudentGroupByldRequest request) {
        List<String> errors = new ArrayList<>();

        validatorId.ValidateIdNotZero(request.getId(), errors, "id", "zero");

        return errors;
    }
}
