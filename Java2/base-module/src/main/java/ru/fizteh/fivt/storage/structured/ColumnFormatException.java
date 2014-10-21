package ru.fizteh.fivt.storage.structured;

import org.springframework.stereotype.Component;

/**
 * Бросается при попытке извлечь из колонки {@link Storeable} значение не соответствующего типа,
 * либо подставить в колонку значение несоответствующего типа.
 */
@Component
public class ColumnFormatException extends IllegalArgumentException {

    public ColumnFormatException() {
    }

    public ColumnFormatException(String s) {
        super(s);
    }

    public ColumnFormatException(String message, Throwable cause) {
        super(message, cause);
    }

    public ColumnFormatException(Throwable cause) {
        super(cause);
    }
}
