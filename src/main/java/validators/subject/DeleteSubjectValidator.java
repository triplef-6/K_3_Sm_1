package validators.subject;

import request.subject.DeleteSubjectRequest;
import validators.Validator;
import validators.primitive.ValidatorId;

import java.util.ArrayList;
import java.util.List;

public class DeleteSubjectValidator implements Validator<DeleteSubjectRequest> {
    private ValidatorId validatorId;

    @Override
    public List<String> validator(DeleteSubjectRequest request) {
        List<String> errors = new ArrayList<>();

        validatorId.validateIdNotZero(request.getId(), errors, "Id", "zero");

        return errors;
    }
}
