package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetExample {
    public static void main(String[] args) {
        List<String> values = new ArrayList<>();
        values.add("java");
        values.add("python");
        values.add("java");
        values.add("c++");
        values.add("python");
        values.add("dotnet");

        HashSet<String> removeDuplicate = new HashSet<>();
        removeDuplicate.addAll(values);
        for (String s: removeDuplicate){
            System.out.println(s);
        }
    }
}
