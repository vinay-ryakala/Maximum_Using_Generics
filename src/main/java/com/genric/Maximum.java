package com.genric;

//Welcome to  maximum number using generics
public class Maximum {
    //using generic method to find maximum
    public static <E extends Comparable<E>> E maximumGenericMethod(E firstValue,E secondValue,E thirdValue){
        E max = firstValue;
        if(secondValue.compareTo(max) > 0)
            max = secondValue;
        if(thirdValue.compareTo(max) > 0)
            max = thirdValue;
        return max;
    }
}