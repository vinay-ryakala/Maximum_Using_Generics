package com.genric;

//Welcome to  maximum number using generics
import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    @Test
    public void givenIntegerFirstNumberGrater_WhenLargest_ShouldReturnMax(){
        Integer expected = 90;
        Integer[] integerArray ={90, 20, 10};
        Integer acctualResult =  Maximum.maximumGenericMethod(integerArray);
        Assert.assertEquals(expected,acctualResult);

    }

    @Test
    public void givenIntegerSecondNumberGrater_WhenLargest_ShouldReturnMax(){
        Integer expected = 90;
        Integer[] integerArray ={20, 90, 10};
        Integer acctualResult =  Maximum.maximumGenericMethod(integerArray);
        Assert.assertEquals(expected,acctualResult);
    }

    @Test
    public void givenIntegerThirdNumberGrater_WhenLargest_ShouldReturnMax(){
        Integer expected = 90;
        Integer[] integerArray ={20, 10, 90};
        Integer acctualResult =  Maximum.maximumGenericMethod(integerArray);
        Assert.assertEquals(expected,acctualResult);

    }
    @Test
    public void givenFloatFirstNumberGrater_WhenLargest_ShouldReturnMax(){
        Float expectedFloat = 90.5f;
        Float[] floatArray ={90.5f,20.56f,10.52f};
        Float acctualResultFloat =  Maximum.maximumGenericMethod(floatArray);
        Assert.assertEquals(expectedFloat,acctualResultFloat);

    }
    @Test
    public void givenFloatSecondNumberGrater_WhenLargest_ShouldReturnMax(){
        Float expectedFloat = 90.5f;
        Float[] floatArray ={20.5f,90.5f,10.6f};
        Float acctualResultFloat =  Maximum.maximumGenericMethod(floatArray);
        Assert.assertEquals(expectedFloat,acctualResultFloat);
    }
    @Test
    public void givenFloatThirdNumberGrater_WhenLargest_ShouldReturnMax(){
        Float expectedFloat = 90.5f;
        Float[] floatArray ={20.5f,10.5f,90.5f};
        Float acctualResultFloat =  Maximum.maximumGenericMethod(floatArray);
        Assert.assertEquals(expectedFloat,acctualResultFloat);
    }
    @Test
    public void givenFirstStringGrater_WhenLargest_ShouldReturnMax(){
        String expectedString = "Bat";
        String[] stringArray = {"Bat","Apple","Ant"};
        String acctualResult =  Maximum.maximumGenericMethod(stringArray);
        Assert.assertEquals(expectedString,acctualResult);
    }
    @Test
    public void givenSecondStringGrater_WhenLargest_ShouldReturnMax(){
        String expectedString = "Bat";
        String[] stringArray = {"Apple","Bat","Ant"};
        String acctualResult =  Maximum.maximumGenericMethod(stringArray);
        Assert.assertEquals(expectedString,acctualResult);
    }
    @Test
    public void givenThirdStringGrater_WhenLargest_ShouldReturnMax(){
        String expectedString = "Bat";
        String[] stringArray = {"Apple","Ant","Bat"};
        String acctualResult =  Maximum.maximumGenericMethod(stringArray);
        Assert.assertEquals(expectedString,acctualResult);
    }
    //using generic class
    @Test
    public void parametricGenricClass() {
        Integer[] integerArray ={1,2,3,4,5,6,7,8,9};
        Float[] floatArray ={20.5f,10.5f,90.5f,50.6f};
        String[] stringArray = {"Apple","Ant","Bat","Aa","Ab"};
        Assert.assertEquals(new Maximum(stringArray).maximum(),"Bat");
        Assert.assertEquals(new Maximum(integerArray).maximum(),9);
        Assert.assertEquals(new Maximum(floatArray).maximum(),90.5f);
   }
}
