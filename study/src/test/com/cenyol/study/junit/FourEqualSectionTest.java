package com.cenyol.study.junit;

import com.cenyol.study.models.Calculator;
import com.cenyol.study.models.FourEqualSection;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by cenyol on 02/03/2017.
 */

public class FourEqualSectionTest {
    @Test
    public void resolveA() {
        FourEqualSection fourEqualSection = new FourEqualSection();

        int[] A = {2,5,1,1,1,1,5,1,7,3,7};
        assertEquals(false, fourEqualSection.resolve(A));

        int[] B = {2,5,1,1,3,4,1,2,1,2,5,1,1,7};
        assertEquals(true, fourEqualSection.resolve(B));

        int[] C = {2,5,1,1,3,4,1,2,1,2,5,1,1,7};
        assertEquals(true, fourEqualSection.resolve(C));

//        int[] d = {1,4,111111,5,1,2,3,1,2,3};
//        assertEquals(true, fourEqualSection.resolve(d));
    }
}