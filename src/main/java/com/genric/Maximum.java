package com.genric;

//Welcome to  maximum number using generics
public class Maximum {
    public Integer getMax(Integer firstValue, Integer secondValue, Integer thirdValue) {
        Integer max = firstValue;
        if(secondValue.compareTo(max) > 0)
            max = secondValue;
        if(thirdValue.compareTo(max) > 0)
            max = thirdValue;
        return max;
    }
}