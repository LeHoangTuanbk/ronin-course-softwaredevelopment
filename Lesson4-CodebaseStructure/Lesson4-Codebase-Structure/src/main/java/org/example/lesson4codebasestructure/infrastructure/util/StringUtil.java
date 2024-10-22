package org.example.lesson4codebasestructure.infrastructure.util;

public class StringUtil {

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }

    public static String capitalizeFirstLetter(String str) {
        if (isNullOrEmpty(str)) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
}
