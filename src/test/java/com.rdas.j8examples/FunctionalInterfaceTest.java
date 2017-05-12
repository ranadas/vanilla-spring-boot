package com.rdas.j8examples;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.Function;

/**
 * Created by x148128 on 12/05/2017.
 */
public class FunctionalInterfaceTest {

    /**
     * must contain exactly one abstract method declaration
     */
    @FunctionalInterface
    interface Converter<F, T> {
        T convert(F from);
    }

    @Test
    public void testNumericConverter() {
        Converter<String, Integer> string2IntergerConverter = (from) -> Integer.valueOf(from);

        // method reference
        Converter<String, Long> string2LongConverter = Long::valueOf;

        Assert.assertTrue(string2IntergerConverter.convert("123") == 123);
        Assert.assertTrue(string2LongConverter.convert("9999") == 9999L);
    }
}
