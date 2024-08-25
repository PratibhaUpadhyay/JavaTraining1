package org.example;

import java.util.Scanner;

public class demoProgram2 {
    public static void main(String[] args) {
        Scanner intp = new Scanner(System.in);
        int num = intp.nextInt();

        while(num <10){
            if(num>6){
                System.out.println("You won the game");
            }
            else {
                System.out.println("you lost the game");
            }

        }
    }
}
