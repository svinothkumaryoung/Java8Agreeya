package com.agreeya.FunctionInFunctionalInterface;

import java.util.function.Function;

public class RetrunVal {

    public static void main(String[] args) {
        Function<Float,Float> fun=(n)->
        {
        return  n*n;
        };
        System.out.println(fun.apply(20.3f));
    }
}
