package com.java_annotations_custom.docgen;

import com.java_annotations_custom.math.MathUtils;
import com.sun.source.util.SourcePositions;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {
        // Get a class object
        Class<?> clazz = MathUtils.class;

        // Get all declared methods
//        Method[] methods = clazz.getMethods();    // Gets all methods, including inherited methods
        Method[] methods = clazz.getDeclaredMethods();
        int methodCount = methods.length;

        // Loop over methods

        for (Method m : methods) {
            // Display method name
            System.out.printf("Name: %s%n", m.getName());

            // Display parameter count
            System.out.printf("\t# params: %s%n", m.getParameterCount());

            // Display return type
            System.out.printf("\treturn type: %s%n", m.getReturnType().getSimpleName());

            // Display modifiers
            int mods = m.getModifiers();
            String modStr = Modifier.toString(mods);
            System.out.printf("\tmodifiers: %s%n", modStr);

        }

        // TODO: Process the MathUtils class's annotations
        DocProcessor.process(MathUtils.class);
    }
}
