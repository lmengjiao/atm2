package com.collection.test;

import java.util.ArrayList;

/*
 * 创建一个集合，存放元素"1","$","2","$","3","$","4"
 * 使用迭代器遍历集合，并在过程中删除所有的"$"，
 * 最后再将删除元素后的集合使用新循环遍历，并输出每一个元素。
 */
public class Text02 {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add("1");
        list.add("$");
        list.add("2");
        list.add("$");
        list.add("3");
        list.add("$");
        System.out.println("list = " + list);
        for (int i = 0; i <list.size() ; i++) {
            list.remove("$");
        }
        System.out.println("list = " + list);
    }
}
