package org.example;

public class Audi {
    public static void main(String[] args) {
        car audi = new car();
        audi.setColor("pink");
        audi.setWeight(90.908);
        audi.displayCar();

        car.accelerate();
        displayLogo("A");
        displayLogo(8);
    }

    public static void displayLogo(String s1) {
        System.out.println("Logo is :" + s1);
    }

    public static void displayLogo(int s) {
        System.out.println("Logo is :"+ s);
    }
}
