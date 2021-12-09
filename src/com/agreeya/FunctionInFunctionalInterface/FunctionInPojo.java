package com.agreeya.FunctionInFunctionalInterface;

import com.agreeya.DataLayer.DataAccessLayer;
import com.agreeya.StudentPojoClass.StudentInfoModel;

import java.util.List;
import java.util.function.Function;

public class FunctionInPojo {
    static Function<String,Integer> function=(n)->n.length();

    public static void main(String[] args) {
        List<StudentInfoModel> smi=DataAccessLayer.getStudentInfo();
        smi.forEach(s->
        {
            System.out.println("Size of String "+function.apply(s.getName()));
        });

    }
}
