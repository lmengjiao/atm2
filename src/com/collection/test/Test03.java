package com.collection.test;

import java.util.ArrayList;

/*
 * 创建一个List集合(ArrayList,LinkedList均可)
 * 存放元素"one","two","three","four"。
 * 获取集合第二个元素并输出。
 * 将集合第三个元素设置为"3"
 * 在集合第二个位置上插入元素"2"
 * 删除集合第三个元素
 */
public class Test03 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        System.out.println("list.get(2) = " + list.get(2));
        list.set(3,3);
        System.out.println("list = " + list);
        list.add(2,2);
        System.out.println("list = " + list);
        list.remove(3);
        System.out.println("list = " + list);
    }
}
