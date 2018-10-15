package com.moses;

import java.lang.reflect.Array;
import java.util.Arrays;

public class JavaGenerics {
    public static void main(String[] args) {
        Integer[] intArray={1,2,3};
        String[] strArray={"aa","bb"};
        printArray(strArray);
    }
    static void printArray(Object[] myArray){
        for(int i=0; i<myArray.length;i++){
            System.out.println(myArray[i]);
        }
    }
}
