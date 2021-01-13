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

    public Float getMaxFloat(Float firstValueFloat, Float secondValueFloat, Float thirdValueFloat) {
        Float max = firstValueFloat;
        if(secondValueFloat.compareTo(max) > 0)
            max = secondValueFloat;
        if(thirdValueFloat.compareTo(max) > 0)
            max = thirdValueFloat;
        return max;
    }
}