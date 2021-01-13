package com.genric;

//Welcome to  maximum number using generics
import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    @Test
    public void givenIntegerFirstNumberGrater_WhenLargest_ShouldReturnMax(){
        Integer expected = 90;
        Integer acctualResult =  Maximum.maximumGenericMethod(90,20,10);
        Assert.assertEquals(expected,acctualResult);

    }

    @Test
    public void givenIntegerSecondNumberGrater_WhenLargest_ShouldReturnMax(){
        Integer expected = 90;
        Integer acctualResult =  Maximum.maximumGenericMethod(20,90,10);
        Assert.assertEquals(expected,acctualResult);
    }

    @Test
    public void givenIntegerThirdNumberGrater_WhenLargest_ShouldReturnMax(){
        Integer expected = 90;
        Integer acctualResult =  Maximum.maximumGenericMethod(20,10,90);
        Assert.assertEquals(expected,acctualResult);

    }
    @Test
    public void givenFloatFirstNumberGrater_WhenLargest_ShouldReturnMax(){
        Float expectedFloat = 90.5f;
        Float acctualResultFloat =  Maximum.maximumGenericMethod(90.5f,20.56f,10.52f);
        Assert.assertEquals(expectedFloat,acctualResultFloat);

    }
    @Test
    public void givenFloatSecondNumberGrater_WhenLargest_ShouldReturnMax(){
        Float expectedFloat = 90.5f;
        Float acctualResultFloat =  Maximum.maximumGenericMethod(20.5f,90.5f,10.6f);
        Assert.assertEquals(expectedFloat,acctualResultFloat);
    }
    @Test
    public void givenFloatThirdNumberGrater_WhenLargest_ShouldReturnMax(){
        Float expectedFloat = 90.5f;
        Float acctualResultFloat =  Maximum.maximumGenericMethod(20.5f,10.5f,90.5f);
        Assert.assertEquals(expectedFloat,acctualResultFloat);
    }
    @Test
    public void givenFirstStringGrater_WhenLargest_ShouldReturnMax(){
        String expectedString = "Bat";
       // Maximum maximum = new Maximum();
        String acctualResult =  Maximum.maximumGenericMethod("Bat","Apple","Ant");
        Assert.assertEquals(expectedString,acctualResult);
    }
    @Test
    public void givenSecondStringGrater_WhenLargest_ShouldReturnMax(){
        String expectedString = "Bat";
        String acctualResult =  Maximum.maximumGenericMethod("Apple","Bat","Ant");
        Assert.assertEquals(expectedString,acctualResult);
    }
    @Test
    public void givenThirdStringGrater_WhenLargest_ShouldReturnMax(){
        String expectedString = "Bat";
        String acctualResult =  Maximum.maximumGenericMethod("Apple","Ant","Bat");
        Assert.assertEquals(expectedString,acctualResult);
    }
    //using generic class
    @Test
    public void parametricGenricClass() {
        Integer firstInt=1,secondInt=2,thirdInt=3;
        Float firstFloat=1.2f,secondFloat=9.8f,thirdFloat=6.5f;
        String firstString="apple",secondString="ball",thirdString="bat";
        Assert.assertEquals(new Maximum(firstString,secondString,thirdString).maximum(),"bat");
        Assert.assertEquals(new Maximum(firstInt,secondInt,thirdInt).maximum(),3);
        Assert.assertEquals(new Maximum(firstFloat,secondFloat,thirdFloat).maximum(),9.8f);
   }
}
