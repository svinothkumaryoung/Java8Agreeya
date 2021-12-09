package com.agreeya;

import java.util.HashMap;
import java.util.Map;

public class HashMapIm {
    HashMap<String,String> hmn=new HashMap<String,String>();
    void getUserData()
    {
        hmn.put("Register No","1234");
        hmn.put("name ","Vinothkumar Selvaarasan");
        hmn.put("name ","Vino");
        hmn.put("Phone no","9344088356");
    }
    void reteriveValues()
    {
        for(Map.Entry<String,String> he:hmn.entrySet() )
        {
           System.out.println( he.getKey());
            System.out.println(he.getValue());
        }
    }

    public static void main(String[] args) {
        HashMapIm hmi=new HashMapIm();
        hmi.getUserData();
        hmi.reteriveValues();
    }
}
