package com.collection.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 *定义私有属性:
 * String name;
 * int age;
 * String gender;
 * int salary;
 * Date hiredate;//入职时间
 *
 * 定义构造方法，以及属性get,set方法.
 * 定义toString方法，格式如:
 *    张三,25,男,5000,2006-02-15
 *
 * 定义equals方法，要求名字以及年龄相同，则认为内容一致。
 */
public class Test {
    public static void main(String[] args) {
        Emp emp=new Emp();
        emp.setName("张三");
        emp.setAge(25);
        emp.setGender("男");
        emp.setSalary(5000);
        List<Emp> list=new ArrayList<>();
        list.add(emp);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的名字");
        String name=sc.nextLine();
        System.out.println("请输入你的年龄");
        int age=sc.nextInt();
        if(name.equals(emp.getName())){
            if(age==emp.getAge()){
                System.out.println("内容一致");
            }else{
                System.out.println("内容不一致");
            }
        }else{
            System.out.println("内容不一致");
        }
    }
}
