package com.thoughtworks.fairrations;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FairRationsTest {

    private FairRations fairRations;

    @Before
    public void setUp() {
        fairRations = new FairRations();

    }

    @Test
    public void testTwoReturnOutputNO() throws Exception{
        int[] arrayTwo = {1, 2};
        Assert.assertEquals("NO",fairRations.toString(arrayTwo));
    }

    @Test
    public void testThreeReturnOutputNO() throws Exception {
        int[] arrayThree = {1, 2, 3};
        Assert.assertEquals("4",fairRations.toString(arrayThree));
    }

    @Test
    public void testFourReturnOutputFour() throws Exception {
        int[] arrayFour = {1, 2, 3, 4};
        Assert.assertEquals("4",fairRations.toString(arrayFour));
    }
}
