package com.genric;

//Welcome to  maximum number using generics
public class Maximum<T extends Comparable<T>> {
    T x,y,z;

    public Maximum(T x,T y,T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public T maximum(){
        return Maximum.maximumGenericMethod(x,y,z);
    }

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