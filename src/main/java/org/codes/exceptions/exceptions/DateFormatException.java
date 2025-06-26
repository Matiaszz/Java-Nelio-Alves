package org.codes.exceptions.exceptions;

import java.text.ParseException;

public class DateFormatException extends ParseException {
    public DateFormatException(String message, int pos) {
        super(message, pos);
        System.out.println("Ensure that date is well formated.");
    }
}
