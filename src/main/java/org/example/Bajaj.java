package org.example;

public class Bajaj extends Bike {

    void run(){
        System.out.println("Run the bike");
    }

    @Override
    void breaks() {
        super.breaks();
    }
}
