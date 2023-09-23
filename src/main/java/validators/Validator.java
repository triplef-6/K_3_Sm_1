package validators;

import java.util.List;

/**
 * Валидатор для запросов
 * @param <T> класс запроса
 */
public interface Validator <T> {
    List<String> validator(T request);
}
