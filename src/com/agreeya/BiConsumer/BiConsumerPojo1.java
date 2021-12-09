package com.agreeya.BiConsumer;

import com.agreeya.DataLayer.DataAccessLayer;
import com.agreeya.StudentPojoClass.StudentInfoModel;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerPojo1 {
    static void MainpulateString()
    {
    BiConsumer<String,String> bic=(name,city)->
    {
        System.out.println(name+" "+city);
    };
    List<StudentInfoModel> studentInfo= DataAccessLayer.getStudentInfo();
    studentInfo.forEach(si->bic.accept(si.getName(),si.getCity()));
    }

    public static void main(String[] args) {
      //  BiConsumerPojo1 bcp=new BiConsumerPojo1();
        MainpulateString();
    }
}
