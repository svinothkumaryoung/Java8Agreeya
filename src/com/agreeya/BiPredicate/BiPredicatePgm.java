package com.agreeya.BiPredicate;

import java.util.function.BiPredicate;

public class BiPredicatePgm {

    static BiPredicate<Integer, String> biPredicate = (r, n) -> (n.equals("VinothKumar") && r >= 30);
    public static void main(String[] args) {
       Boolean val= biPredicate.test(30,"VinothKumar");
       System.out.println(val);
    }
}

