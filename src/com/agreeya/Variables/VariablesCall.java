package com.agreeya.Variables;

import java.util.function.Consumer;
/*
Class Variable is allowed to change values inside the lambda expression
 */
public class VariablesCall {
   static int i=0;

    public static void main(String[] args) {
        int j=10;
        Consumer<Integer> consumer=(c)->
        {
          //  j=11;
            i=2;
            System.out.println("Values of I (Class Variable "+i);
            System.out.println("Values of i+j is "+(j+c));
        };
        consumer.accept(3);
    }
}
