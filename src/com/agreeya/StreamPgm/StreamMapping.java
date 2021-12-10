package com.agreeya.StreamPgm;

import com.agreeya.DataLayer.DataAccessLayer;
import com.agreeya.StudentPojoClass.StudentInfoModel;

import javax.xml.crypto.Data;
import java.sql.Statement;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMapping {


    static void processData()
    {
         Map<String,String> map1= DataAccessLayer.getStudentInfo()
                 .stream()
                 .peek(System.out::println)
                .collect(Collectors.toMap(StudentInfoModel::getName,StudentInfoModel::getCountry));
        System.out.println(map1);
    }
    public static void main(String[] args) {
        processData();
    }
}
