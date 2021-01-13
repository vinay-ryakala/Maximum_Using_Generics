package com.genric;

import java.util.Arrays;
import java.util.List;

//Welcome to  maximum number using generics
public class Maximum<T extends Comparable<T>> {
    T [] inputArray;

    public Maximum(T[] inputArray) {
        this.inputArray = inputArray ;
    }
    public T maximum(){
        return Maximum.maximumGenericMethod(inputArray);
    }

    //using generic method to find maximum
    public static <E extends Comparable<E>> E maximumGenericMethod(E [] inputArray){
        List<E> arrayToList = Arrays.asList(inputArray);
        E max = arrayToList.get(0);
        for (int i=1; i<arrayToList.size();i++){
            if(arrayToList.get(i).compareTo(max) > 0)
                max = arrayToList.get(i);

        }
        printMax(arrayToList,max);
        return max;
    }

    private static <E> void printMax(E arrayToList, E max) {
        System.out.println("Max of "+arrayToList+" is "+max);
    }
}