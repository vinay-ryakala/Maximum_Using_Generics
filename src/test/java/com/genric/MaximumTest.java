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
    @Test
    public void givenFloatFirstNumberGrater_WhenLargest_ShouldReturnMax(){
        Float expectedFloat = 90.5f;
        Maximum maximum = new Maximum();
        Float acctualResultFloat =  maximum.getMaxFloat(90.5f,20.56f,10.52f);
        Assert.assertEquals(expectedFloat,acctualResultFloat);

    }
    @Test
    public void givenFloatSecondNumberGrater_WhenLargest_ShouldReturnMax(){
        Float expectedFloat = 90.5f;
        Maximum maximum = new Maximum();
        Float acctualResultFloat =  maximum.getMaxFloat(20.5f,90.5f,10.6f);
        Assert.assertEquals(expectedFloat,acctualResultFloat);
    }
    @Test
    public void givenFloatThirdNumberGrater_WhenLargest_ShouldReturnMax(){
        Float expectedFloat = 90.5f;
        Maximum maximum = new Maximum();
        Float acctualResultFloat =  maximum.getMaxFloat(20.5f,10.5f,90.5f);
        Assert.assertEquals(expectedFloat,acctualResultFloat);
    }
    @Test
    public void givenFirstStringGrater_WhenLargest_ShouldReturnMax(){
        String expectedString = "Bat";
        Maximum maximum = new Maximum();
        String acctualResult =  maximum.getMaxString("Bat","Apple","Ant");
        Assert.assertEquals(expectedString,acctualResult);
    }
    @Test
    public void givenSecondStringGrater_WhenLargest_ShouldReturnMax(){
        String expectedString = "Bat";
        Maximum maximum = new Maximum();
        String acctualResult =  maximum.getMaxString("Apple","Bat","Ant");
        Assert.assertEquals(expectedString,acctualResult);
    }
    @Test
    public void givenThirdStringGrater_WhenLargest_ShouldReturnMax(){
        String expectedString = "Bat";
        Maximum maximum = new Maximum();
        String acctualResult =  maximum.getMaxString("Apple","Ant","Bat");
        Assert.assertEquals(expectedString,acctualResult);
    }



}
