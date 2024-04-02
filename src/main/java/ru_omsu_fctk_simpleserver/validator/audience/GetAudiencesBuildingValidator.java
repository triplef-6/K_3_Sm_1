package ru_omsu_fctk_simpleserver.validator.audience;

import ru_omsu_fctk_simpleserver.request.audience.AddAudienceRequest;
import ru_omsu_fctk_simpleserver.request.audience.GetAudiencesBuildingRequest;
import ru_omsu_fctk_simpleserver.validator.Validator;
import ru_omsu_fctk_simpleserver.validator.primitive.ValidateString;
import ru_omsu_fctk_simpleserver.validator.primitive.ValidatorInt;

import java.util.ArrayList;
import java.util.List;

public class GetAudiencesBuildingValidator implements Validator<GetAudiencesBuildingRequest> {
    private ValidatorInt validateInt;

    public GetAudiencesBuildingValidator( ValidatorInt validateInt) {
        this.validateInt = validateInt;

    }

    @Override
    public List<String> validator(GetAudiencesBuildingRequest request) {

        List<String> errors = new ArrayList<>();

        validateInt.validateIntNotZero(request.getBuildingNumber(), errors, "buildingNumber", "zero");
        return errors;
    }
}