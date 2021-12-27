package com.epam.esm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

    public static final String POSITIVE_NUMBER = "1234.567";
    public static final String NEGATIVE_NUMBER = "-1234.567";
    public static final String ZERO_NUMBER = "0";

    @Test
    void isPositiveNumberTestPositiveNumber() {
        Assertions.assertTrue(StringUtils.isPositiveNumber(POSITIVE_NUMBER));
    }

    @Test
    void isPositiveNumberTestNegativeNumber() {
        Assertions.assertFalse(StringUtils.isPositiveNumber(NEGATIVE_NUMBER));
    }

    @Test
    void isPositiveNumberTestZeroNumber() {
        Assertions.assertFalse(StringUtils.isPositiveNumber(ZERO_NUMBER));
    }
}
