package com.agreeya.consumerpgm;

import com.agreeya.DataLayer.DataAccessLayer;
import com.agreeya.StudentPojoClass.StudentInfoModel;

import java.util.List;
import java.util.function.Consumer;
/*
For Each ->Is used by the Consumer
 */
public class ConsumerPgm1 {
    static List<StudentInfoModel> sim= DataAccessLayer.getStudentInfo();
    static Consumer<StudentInfoModel> cons1=(s1)->
    {
        System.out.println(s1);
    };
    static Consumer<StudentInfoModel> consPrintName=(s2)->
    {
      System.out.println(s2.getName());
    };
    static Consumer<StudentInfoModel> consCountry=(s3)->
    {
        System.out.println(s3.getCountry());
    };
    static void printData()
    {
        sim.forEach(cons1.andThen(consPrintName).andThen(consCountry));
    }
    static void callWithCondition()
    {
        sim.forEach(s->
        {
            if(s.getZipcode().equals("600000") && s.getName().equals("VinothKumar"))
            {
                cons1.accept(s);
            }

        });
    }

    public static void main(String[] args) {
        ConsumerPgm1.callWithCondition();
    }

}
