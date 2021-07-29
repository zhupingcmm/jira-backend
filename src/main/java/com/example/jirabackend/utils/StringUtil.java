package com.example.jirabackend.utils;

public class StringUtil {
    public static boolean isFalsy (String str) {
        if (str == null || str.equals("")) return true;
        return false;
    }
}
