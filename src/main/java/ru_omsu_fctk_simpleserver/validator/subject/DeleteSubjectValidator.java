package ru_omsu_fctk_simpleserver.validator.subject;

import ru_omsu_fctk_simpleserver.request.subject.DeleteSubjectRequest;
import ru_omsu_fctk_simpleserver.Validator;
import ru_omsu_fctk_simpleserver.validator.primitive.ValidatorId;

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
