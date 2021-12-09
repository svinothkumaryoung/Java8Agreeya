package com.agreeya.predicatePgm;

import com.agreeya.DataLayer.DataAccessLayer;
import com.agreeya.StudentPojoClass.StudentInfoModel;

import java.util.List;
import java.util.function.Predicate;

public class PredicatePojoClass {

    static Predicate<StudentInfoModel> predicate1=(studentInfoModel1)->
            (studentInfoModel1.getRegisterNo()>=6667);


    static Predicate<StudentInfoModel> predicate2=(studentInfoModel2)->
            (studentInfoModel2.getZipcode().equals("639004"));


    public static void main(String[] args) {
        List<StudentInfoModel> studentInfo= DataAccessLayer.getStudentInfo();

        studentInfo.forEach(s->
        {
            if(predicate1.and(predicate2).test(s))
            {
                System.out.println("New  "+s);
            }
        });
    }
}
