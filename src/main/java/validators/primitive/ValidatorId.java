package validators.primitive;

import java.util.List;

/**
 * Валидатор id(long)
 */
public class ValidatorId {
    public boolean ValidateIdNotZero(long id, List<String> errors, String fieldName, String errorMessage) {
        if (id <= 0) {
            errors.add(fieldName + ": " + errorMessage);
            return false;
        }
        return true;
    }
}
