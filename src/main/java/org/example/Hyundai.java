package org.example;

import java.security.Key;

public class Hyundai extends car{
    public static void main(String[] args) {
        start();
        accelerate();
        breaks();
    }

    public static void breaks() {
        System.out.println("Press the brakes");
    }

    public static void start() {
        String key = "ON";
        System.out.println("Turn the keys" + key);

    }
}
