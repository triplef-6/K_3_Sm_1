package validators.primitive;

import java.util.List;

/**
 * Валидатор целых чисел
 */
public class ValidatorInt {
    public boolean ValidateIntNotZero(int i, List<String> errors, String fieldName, String errorMessage) {
        if (i <= 0) {
            errors.add(fieldName + ": " + errorMessage);
            return false;
        }
        return true;
    }
}
