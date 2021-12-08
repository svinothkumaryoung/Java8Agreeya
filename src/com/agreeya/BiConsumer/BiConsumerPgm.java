package com.agreeya.BiConsumer;

import java.util.function.BiConsumer;

public class BiConsumerPgm {
    static BiConsumer<String,Integer> bc=(n,m)->
    {
        System.out.println("The String Value is "+n+" And Integer Value is "+m);
    };

    public static void main(String[] args) {
        bc.accept("Vinothkumar",666);
    }
}
