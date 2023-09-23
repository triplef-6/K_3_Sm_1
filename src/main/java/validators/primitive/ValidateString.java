package validators.primitive;

import java.util.List;

/**
 * Валидатор строк
 */
public class ValidateString {
    public boolean ValidateStringNotEmpty(String str, List<String> errors, String fieldName, String errorMessage) {
        if (str.equals("")) {
            errors.add(fieldName + ": " + errorMessage);
            return false;
        }
        return true;
    }

    public boolean ValidateStringNotNull(String str, List<String> errors, String fieldName, String errorMessage) {
        if (str == null) {
            errors.add(fieldName + ": " + errorMessage);
            return false;
        }
        return true;
    }

    public boolean ValidateStringBig(String str, List<String> errors, String fieldName, String errorMessage, int k) {
        if (str.length() > k) {
            errors.add(fieldName + ": " + errorMessage);
            return false;
        }
        return true;
    }

}
