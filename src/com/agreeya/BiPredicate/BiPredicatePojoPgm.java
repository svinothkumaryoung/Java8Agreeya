package com.agreeya.BiPredicate;

import com.agreeya.DataLayer.DataAccessLayer;
import com.agreeya.StudentPojoClass.StudentInfoModel;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class BiPredicatePojoPgm {
    static StudentInfoModel sim=DataAccessLayer.getStudent();
    static BiPredicate<String,String> bip=(n,c)->n.equals("Vinoth") && c.equals("India");

    static Consumer<StudentInfoModel> si=(s)->{
      if(bip.test(s.getName(),s.getCountry()))
      {
          System.out.println("Condition Satisfied");
          System.out.print(sim);
      }
      else
      {
          System.out.print("Condition Not Satisfied");
          System.out.print(sim);
      }
    };
    public static void main(String[] args) {
        si.accept(sim);
    }

}
