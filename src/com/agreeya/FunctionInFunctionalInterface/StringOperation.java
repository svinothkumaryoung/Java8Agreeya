package com.agreeya.FunctionInFunctionalInterface;

import java.util.function.Function;

public class StringOperation {
    static Function<String,String> function=(n)->
    {
        return n.toUpperCase();
    };

    public static void main(String[] args) {
        System.out.println("Value passed is Agreeya  "+function.apply("Agreeya"));
    }
}
