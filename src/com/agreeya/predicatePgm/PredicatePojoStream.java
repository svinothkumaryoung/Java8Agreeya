package com.agreeya.predicatePgm;

import com.agreeya.DataLayer.DataAccessLayer;
import com.agreeya.StudentPojoClass.StudentInfoModel;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicatePojoStream {

    static Predicate<StudentInfoModel> predicate1=(studentInfoModel1)->
            (studentInfoModel1.getRegisterNo()>=6667);


    static Predicate<StudentInfoModel> predicate2=(studentInfoModel2)->
            (studentInfoModel2.getZipcode().equals("639004"));


    public static void main(String[] args) {
        List<StudentInfoModel> studentInfo= DataAccessLayer.getStudentInfo();
      //  System.out.println(studentInfo);

        List<StudentInfoModel> predicateOutput=
                 studentInfo.stream()
                .filter(predicate1)
                .filter(predicate2)
                //.peek(System.out::println)
                .collect(Collectors.toList());

       System.out.println(predicateOutput);

    }
}
