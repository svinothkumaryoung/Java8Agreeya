package com.agreeya.BiFunction;

import com.agreeya.DataLayer.DataAccessLayer;
import com.agreeya.StudentPojoClass.StudentInfoModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionPojoClass {
    static List<String> list2;//One List which is used to store Result return by bifunction
    static  Predicate<StudentInfoModel> predicate1=(sim1)->sim1.getZipcode().equals("639004");
    static  Predicate<StudentInfoModel> predicate2=(sim2)->sim2.getCountry().equals("India");
    static BiFunction<List<StudentInfoModel>,Predicate<StudentInfoModel>, List<String>> bif=
            (list1,p1)->{
                list2=new ArrayList<String>();
                list1.forEach(l->
                {
                    if(p1.and(predicate2).test(l))
                    {
                        list2.add(l.getName());
                    }
                });
        return list2;
            };

    public static void main(String[] args) {
        List<StudentInfoModel> smi= DataAccessLayer.getStudentInfo();
        System.out.println(bif.apply(smi,predicate1));
    }

}
