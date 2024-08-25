package org.example;

public class Dell implements Company{

    @Override
    public void getProducts() {
        System.out.println("Lists all the dell products ");
    }

    @Override
    public void getEmployees() {
        System.out.println("Print the names of all the employees");
    }
}
