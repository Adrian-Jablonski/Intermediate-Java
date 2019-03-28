package com.java_annotations_custom.docgen;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// @interface tells java that this will be an annotation
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})   // Where our annotation can be used. (In this example; classes and methods)
public @interface Doc {

    /** Description of class or method */
    String desc() default "";

    /** Description of parameters, if annotated element is a method & has parameters */
    String[] params() default {};

    /** Description of return value, if annotated element is a method & isn't void */
    String returnVal() default "";
}