package com.agreeya.BiFunction;
/*
BiFunction->Accept three Arguments
1.Input
2.Input
3.Return Type

Inbuilt Method:
apply
andThen
 */

import java.util.function.BiFunction;

public class BiFunctionPgm {
   static BiFunction<String,String,String> bifun=(a,b)->{
        return a+b;
    };

    public static void main(String[] args) {
        System.out.println(bifun.apply("Java ","Developer"));
    }
}
