package org.example;

public class addNumbers {
    public static void main(String[] args) {
        addNumbers(4,5);

        int value = addNumbers(6,5);
        int output = value+5;
        System.out.println("Increment the output "+output);

    }

    public static int addNumbers(int num1 , int num2 ) {
        int result = num1 + num2;
        System.out.println("Addition of Two Numbers:" + result);
        return result;


    }
}
