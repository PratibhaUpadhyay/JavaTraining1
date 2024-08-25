package org.example;

public class ExceptionExamples {
    public static void main(String[] args) {

        handleArithmeticException(100);
        nullPointerExecution(null);
    }

    private static void handleArithmeticException(int number){
        try {
            int a = number / 0;
        }
        catch (ArithmeticException exception){
            exception.printStackTrace();
        }
    }

    public static void nullPointerExecution(String s) {
        try{
            System.out.println(s.length());
        }
        catch (NullPointerException ex){
            ex.printStackTrace();
        }



    }
}
