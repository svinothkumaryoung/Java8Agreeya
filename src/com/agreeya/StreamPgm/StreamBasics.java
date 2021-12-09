package com.agreeya.StreamPgm;

import com.agreeya.DataLayer.DataAccessLayer;
import com.agreeya.StudentPojoClass.StudentInfoModel;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamBasics {
    //static Predicate<StudentInfoModel> predicate=si->si.getZipcode().equals("639004");
    static List<StudentInfoModel> sim= DataAccessLayer.getStudentInfo();
    static void ProcessMyStream()
    {
                sim.stream()
                .filter(si->si.getZipcode().equals("639004"))
                        .forEach(System.out::println);
      //  System.out.println(s1);

    }

    public static void main(String[] args) {
        ProcessMyStream();
    }
}
