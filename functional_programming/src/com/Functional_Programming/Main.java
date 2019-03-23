package com.Functional_Programming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void yell(String words) {
        System.out.printf("%s!!!!! %n", words.toUpperCase());
    }

    public static void main(String[] args) {
	    List<String> ingredients = Arrays.asList(
	            "flour",
                "salt",
                "baking powder",
                "butter",
                "eggs",
                "milk"
        );

// //	  Imperative style
//	    boolean hasEggs = false;
//	    for (String ingredient : ingredients) {
//	        if (ingredient.equals("eggs")) {
//	            hasEggs = true;
//	            break;
//            }
//        }

// //	  Declarative style
        if (ingredients.contains("eggs")) {
            System.out.println("Sorry. It has eggs");
        }

//        for (String ingredient : ingredients) {
//            System.out.println(ingredient);
//        }

//        // Old way of using For Each loop
//        ingredients.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

//        // New way of using For Each loop using lambda (long way)
//        ingredients.forEach((String ingredient) -> {
//            System.out.println(ingredient);
//        });

//        // New way of using For Each loop using lambda (Short way)
//        ingredients.forEach(ingredient -> System.out.println(ingredient));

//        // Anonymous consumer function. (Could be reused)
//        Consumer<String> printer = ingredient -> System.out.println(ingredient);
//
//        ingredients.forEach(printer);

        Main.yell("But I want that cupcake");
        ingredients.forEach(System.out::println);

        ingredients.forEach(Main::yell);

    }
}
