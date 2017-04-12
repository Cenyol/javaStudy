package com.cenyol.study.junit;

import com.cenyol.study.models.BitOperation;
import com.cenyol.study.models.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by cenyol on 02/03/2017.
 */

public class BitOperationTest {
    @Test
    public void calculateCoutOf1InN() {
        BitOperation bitOperation = new BitOperation();

        assertEquals(2, bitOperation.calculateCountOf1(9));
        assertEquals(1, bitOperation.calculateCountOf1(1));
        assertEquals(4, bitOperation.calculateCountOf1(15));
    }


    @Test
    public void calculateCountOf11InN() {
        BitOperation bitOperation = new BitOperation();

        assertEquals(2, bitOperation.calculateCountOf11(9));
        assertEquals(1, bitOperation.calculateCountOf11(1));
        assertEquals(2, bitOperation.calculateCountOf11(12));
    }
}