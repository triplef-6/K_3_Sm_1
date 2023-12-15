package ru_omsu_fctk_simpleserver.validator.student;

import ru_omsu_fctk_simpleserver.validator.Validator;
import ru_omsu_fctk_simpleserver.request.student.GetStudentByGroupRequest;
import ru_omsu_fctk_simpleserver.validator.primitive.ValidatorId;

import java.util.ArrayList;
import java.util.List;

public class GetStudentByGroupValidator implements Validator<GetStudentByGroupRequest> {
    private ValidatorId validatorId;

    public GetStudentByGroupValidator(ValidatorId validatorId) {
        this.validatorId = validatorId;
    }

    @Override
    public List<String> validator(GetStudentByGroupRequest request) {
        List<String> errors = new ArrayList<>();

        validatorId.validateIdNotZero(request.getGroupId(), errors, "groupId", "zero");

        return errors;
    }
}
