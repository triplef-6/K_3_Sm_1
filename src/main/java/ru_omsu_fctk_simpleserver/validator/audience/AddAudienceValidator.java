package ru_omsu_fctk_simpleserver.validator.audience;

import ru_omsu_fctk_simpleserver.request.audience.AddAudienceRequest;
import ru_omsu_fctk_simpleserver.request.group.AddStudentGroupsRequest;
import ru_omsu_fctk_simpleserver.validator.Validator;
import ru_omsu_fctk_simpleserver.validator.primitive.ValidateString;
import ru_omsu_fctk_simpleserver.validator.primitive.ValidatorId;
import ru_omsu_fctk_simpleserver.validator.primitive.ValidatorInt;

import java.util.ArrayList;
import java.util.List;

public class AddAudienceValidator implements Validator<AddAudienceRequest> {
        private ValidateString validateString;
    private ValidatorInt validateInt;

    public AddAudienceValidator(ValidateString validateString, ValidatorInt validateInt) {
        this.validateString = validateString;
        this.validateInt = validateInt;

    }

        @Override
        public List<String> validator(AddAudienceRequest request) {

        List<String> errors = new ArrayList<>();
        validateString.validateStringNotEmpty(request.getNumber(), errors, "number", "empty");
        validateString.validateStringNotNull(request.getNumber(), errors, "number", "null");
        validateString.validateStringBig(request.getNumber(), errors, "number", "big", 15);

        validateInt.validateIntNotZero(request.getBuildingNumber(), errors, "buildingNumber", "zero");
        return errors;
    }
}
