package com.rdas.j8examples;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by x148128 on 12/05/2017.
 */
public class DefaultMethodTest {
    interface Formula {
        double calculate(int number);

        default double sqrt(int num) {
            return Math.sqrt(num);
        }
    }

    @Test
    public void testInerfaceDefaultMethod() {
        Formula sqRtFormula = new Formula() {
            @Override
            public double calculate(int number) {
                return sqrt(number);
            }
        };
        Assert.assertTrue(sqRtFormula.calculate(3) == Math.sqrt(3));
    }
}
