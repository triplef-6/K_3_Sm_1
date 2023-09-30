package validators.subject;

import request.subject.GetSubjectByIdRequest;
import validators.Validator;
import validators.primitive.ValidatorId;

import java.util.ArrayList;
import java.util.List;

public class GetSubjectByIdValidator implements Validator<GetSubjectByIdRequest> {
    private ValidatorId validatorId;

    @Override
    public List<String> validator(GetSubjectByIdRequest request) {
        List<String> errors = new ArrayList<>();

        validatorId.validateIdNotZero(request.getId(), errors, "id", "zero");

        return errors;
    }
}