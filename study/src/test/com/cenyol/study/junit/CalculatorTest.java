package com.cenyol.study.junit;

import org.junit.Test;
import com.cenyol.study.models.Calculator;
import static org.junit.Assert.assertEquals;

/**
 * Created by cenyol on 02/03/2017.
 */

public class CalculatorTest {
    @Test
    public void evaluatesExpression() {
        Calculator calculator = new Calculator();
        int sum = calculator.evaluate("1+2+3");
        assertEquals(6, sum);

        sum = calculator.evaluate("-1+0+3");
        assertEquals(2, sum);
    }
}