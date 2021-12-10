package com.agreeya.StreamPgm;

import com.agreeya.DataLayer.DataAccessLayer;
import com.agreeya.StudentPojoClass.StudentInfoModel;

import javax.xml.crypto.Data;
import java.util.List;
import java.util.stream.Collectors;

public class MapStream {
     static List<StudentInfoModel> ls= DataAccessLayer.getStudentInfo();
    static List<String> transform;
    static void procesData()
     {
         transform=ls.stream()
                 .map(StudentInfoModel::getName)
                 .map(String::toUpperCase)
                 .collect(Collectors.toList());
         System.out.println(transform);

     }

    public static void main(String[] args) {
        procesData();
    }

}
