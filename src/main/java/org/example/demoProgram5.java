package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class demoProgram5 {
    public static void main(String[] args) {
        int arr1[] = {1,5,3,4,6, 2};
        int arr2[] = {10,11,12,15};
        Arrays.sort(arr1);
        System.out.println("print length of the array" + " " + arr1.length);
        System.out.println("sort the array" + Arrays.toString(arr1));

        if(arr1.equals(arr2)){
            System.out.println("Arrays are equal");
        }
        else{
            System.out.println("Arrays are not equal");
        }
    }
}
