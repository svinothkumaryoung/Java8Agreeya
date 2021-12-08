package com.agreeya.predicatePgm;

import java.util.function.Predicate;

public class PredicatePgm {


    public static void main(String[] args) {
        Predicate<Integer> predicate=(n)->(n > 60);
        boolean n1=predicate.test(50);
        System.out.println("Return Value is "+n1);

    }
}
