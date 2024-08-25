package org.example;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer,String> languages = new HashMap<>();
        languages.put(1,"Java");
        languages.put(2,"Python");
        languages.put(3,"Java");
        languages.put(4,"dotNet");

        System.out.println("Printing all the languages " + languages);
        if(languages.containsKey(1)){
            System.out.println(languages.get(1));
        }

        if(!languages.isEmpty()){
            System.out.println("Hashmaps contains mapping");
        }

        languages.remove(3);
        System.out.println(languages);
    }
}
