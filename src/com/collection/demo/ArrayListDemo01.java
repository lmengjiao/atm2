package com.collection.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
JDK8的快速取集合中的属性
 */
public class ArrayListDemo01 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("貂蝉");
        p1.setAge(18);
        Person p2 = new Person();
        p2.setName("小乔");
        p2.setAge(16);
        Person p3 = new Person();
        p3.setName("大乔");
        p3.setHeight(20);
        List<Person> list = new ArrayList();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        System.out.println("list = " + list);
        List<String> names=new ArrayList<>();
        //传统方法 遍历list集合 拿出对象names 赋值给新的names集合中
        for (Person p : list) {
            String name=p.getName();
            names.add(name);
        }
        System.out.println("names = " + names);
        //JDK8 stream()
        List<String> collect = list.stream().map(Person::getName).collect(Collectors.toList());
        System.out.println("collect = " + collect);
    }
}