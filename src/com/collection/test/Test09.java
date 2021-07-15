package com.collection.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Test09 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Emp emp = new Emp();
        emp.setName("张三");
        emp.setAge(25);
        emp.setGender("男");
        emp.setSalary(5000);
        String date = "2006-06-15";
        Date date1=sdf.parse(date);
        emp.setHireDate(date1);
        Emp emp1 = new Emp();
        emp1.setName("李四");
        emp1.setAge(26);
        emp1.setGender("女");
        emp1.setSalary(6000);
        String da = "2007-12-14";
        Date da1=sdf.parse(da);
        emp1.setHireDate(da1);
        List<Emp> list = new ArrayList<>();
        list.add(emp);
        list.add(emp1);
        for (Emp emp2 : list) {
            System.out.println("emp2 = " + emp2);
        }
        Emp a=list.get(4);
        Calendar c = Calendar.getInstance();
       //c.setTime(a);
    }
}