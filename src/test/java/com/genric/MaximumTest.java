package com.genric;

//Welcome to  maximum number using generics
import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    @Test
    public void givenIntegerFirstNumberGrater_WhenLargest_ShouldReturnMax(){
        Integer expected = 90;
        Maximum maximum = new Maximum();
        Integer acctualResult =  maximum.getMax(90,20,10);
        Assert.assertEquals(expected,acctualResult);

    }
    @Test
    public void givenIntegerSecondNumberGrater_WhenLargest_ShouldReturnMax(){
        Integer expected = 90;
        Maximum maximum = new Maximum();
        Integer acctualResult =  maximum.getMax(20,90,10);
        Assert.assertEquals(expected,acctualResult);
    }

    @Test
    public void givenIntegerThirdNumberGrater_WhenLargest_ShouldReturnMax(){
        Integer expected = 90;
        Maximum maximum = new Maximum();
        Integer acctualResult =  maximum.getMax(20,10,90);
        Assert.assertEquals(expected,acctualResult);

    }
}
