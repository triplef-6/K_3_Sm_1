package validators.primitive;

import java.util.List;

/**
 * Валидатор строк
 */
public class ValidateString {
    public boolean validateStringNotEmpty(String str, List<String> errors, String fieldName, String errorMessage) {
        if (str.equals("")) {
            errors.add(fieldName + ": " + errorMessage);
            return false;
        }
        return true;
    }

    public boolean validateStringNotNull(String str, List<String> errors, String fieldName, String errorMessage) {
        if (str == null) {
            errors.add(fieldName + ": " + errorMessage);
            return false;
        }
        return true;
    }

    public boolean validateStringBig(String str, List<String> errors, String fieldName, String errorMessage, int k) {
        if (str.length() > k) {
            errors.add(fieldName + ": " + errorMessage);
            return false;
        }
        return true;
    }

    public boolean validateStringStatus(String str, List<String> errors, String fieldName, String errorMessage) {
        if (!str.equals("учится") && !str.equals("в а/о") && !str.equals("отчислен")) {
            errors.add(fieldName + ": " + errorMessage);
            return false;
        }
        return true;
    }
}
