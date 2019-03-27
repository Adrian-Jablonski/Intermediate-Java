package com.override;

public class Main {

    public static void main(String[] args) {
//        // Override example
//        Cheese myCheese = new Cheese();
//        System.out.println(myCheese);

        // Deprecated Example
        Seller s = new Seller();
        s.placeAdInNewspaper("Cheese for sale", 14);    // Method is crossed out showing that it is deprecated and needs to be replaced with a new method
        System.out.println("Ad placed!");
    }

    // Running
    // javac -Xlint -cp src src/com/override/Main.java
    // in the console will give a warning

    // javac -Xlint -d out -cp src src/com/override/Main.java       // Compiles to the out folder
}
