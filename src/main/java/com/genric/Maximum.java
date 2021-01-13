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
        List<E> numb = Arrays.asList(inputArray);
        E max = numb.get(0);
        for (int i=1; i<numb.size();i++){
            if(numb.get(i).compareTo(max) > 0)
                max = numb.get(i);

        }
        return max;
    }
}