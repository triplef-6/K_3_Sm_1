package ru_omsu_fctk_simpleserver.validators.validator.primitive;

import java.util.List;
// не доделан
/**
 * Валидатор целых чисел
 */
public class ValidatorInt {
    public boolean validateIntNotZero(int i, List<String> errors, String fieldName, String errorMessage) {
        if (i <= 0) {
            errors.add(fieldName + ": " + errorMessage);
            return false;
        }
        return true;
    }
}
