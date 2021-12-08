package com.agreeya.consumerpgm;

import com.agreeya.DataLayer.DataAccessLayer;
import com.agreeya.StudentPojoClass.StudentInfoModel;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerUsingPojo {
    static StudentInfoModel si=DataAccessLayer.getStudent();
    static Consumer<StudentInfoModel> sim=(s)->
    {
        System.out.println(s.getName());
    };

    public static void main(String[] args) {

        sim.accept(si);
    }
}
