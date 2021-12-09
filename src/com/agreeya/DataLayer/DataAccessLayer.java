package com.agreeya.DataLayer;

import com.agreeya.StudentPojoClass.StudentInfoModel;

import java.util.Arrays;
import java.util.List;

public class DataAccessLayer {
    static List<StudentInfoModel> modelClass;
    public static List<StudentInfoModel> getStudentInfo() {
        StudentInfoModel sim1 = new StudentInfoModel(6666, "VinothKumar", "Chennai", "India", "639004");
        StudentInfoModel sim2 = new StudentInfoModel(6667, "Ashok Kumar", "Karur", "India", "639004");
        StudentInfoModel sim3 = new StudentInfoModel(6668, "Roshan", "New York", "America", "639004");
        StudentInfoModel sim4 = new StudentInfoModel(6669, "Niranjan", "Mexico", "Mexico", "123");
        modelClass= Arrays.asList(sim1,sim2,sim3,sim4);
        return modelClass;

    }
    public static StudentInfoModel getStudent() {
        StudentInfoModel sim1 = new StudentInfoModel(6666, "VinothKumar", "Chennai", "India", "600000");
        return sim1;


    }
}


