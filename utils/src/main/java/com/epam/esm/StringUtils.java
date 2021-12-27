package com.epam.esm;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {

    public static boolean isPositiveNumber(String str) {
        return NumberUtils.toDouble(str) > 0;
    }

}
