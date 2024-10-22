package org.example.lesson4codebasestructure.infrastructure.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static String formatDate(LocalDateTime date) {
        return date.format(DATE_FORMATTER);
    }

    public static LocalDateTime parseDate(String dateString) {
        return LocalDateTime.parse(dateString, DATE_FORMATTER);
    }
}