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

    public boolean validateStringInt(String id, List<String> errors, String fieldName, String errorMessage) {
        for (int i = 0; i < id.length(); i++) {
            if (!Character.isDigit(id.charAt(i))) {
                errors.add(fieldName + ": " + errorMessage);
                return false;
            }
        }
        return true;
    }

    public boolean validateStringStatus(String status, List<String> errors, String fieldName, String errorMessage) {
        if (!status.equals("учится") && !status.equals("в а/о") && !status.equals("отчислен")) {
            errors.add(fieldName + ": " + errorMessage);
            return false;
        }
        return true;
    }

}
