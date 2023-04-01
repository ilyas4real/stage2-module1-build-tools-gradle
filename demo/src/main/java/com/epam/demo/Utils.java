package com.epam.demo;

import com.epam.utils.StringUtils;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        StringUtils su = new StringUtils();
        for (String s : args) {
            if (su.isPositiveNumber(s) == false) {
                return false;
            }
        }
        return true;
    }
}