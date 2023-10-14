package ru_omsu_fctk_simpleserver.validator.primitive;

import java.util.List;

/**
 * Валидатор id(long)
 */
public class ValidatorId {
    public boolean validateIdNotZero(long id, List<String> errors, String fieldName, String errorMessage) {
        if (id <= 0) {
            errors.add(fieldName + ": " + errorMessage);
            return false;
        }
        return true;
    }
}
