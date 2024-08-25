package org.example;

public class car {

        private String color ;
        private int size ;
        private double weight;

        //it is a constructor with no parameter
        car(){

        }


        public static void start(){
            System.out.println("Press the start key ");
        }

       public static void accelerate() {
           System.out.println("start the accelerator");
       }

    public void setColor(String color) {
            this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public  void displayCar(){
        System.out.println("Color of the car is : " + color);
        System.out.println("Weight of the car is :" + weight);
    }



}
