package org.example;

import java.util.ArrayList;

public class arrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);

        System.out.println(arrayList.size());
        arrayList.remove(2);
        System.out.println("Printing the size of an array after 1st clear " + arrayList.size());
        System.out.println(arrayList.get(1));
    }
}
