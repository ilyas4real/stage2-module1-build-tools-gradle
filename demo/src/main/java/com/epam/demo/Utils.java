package com.epam.demo;

import com.epam.utils.StringUtils;

import java.util.List;
import java.util.Optional;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        Optional<String> firstNegative = args.stream()
                .filter(num -> !StringUtils.isPositiveNumber(num))
                .findFirst();
        return firstNegative.isEmpty();
    }
}