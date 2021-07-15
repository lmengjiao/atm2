package com.collection.demo;

import java.util.ArrayList;

/*
集合：
接口可以继承接口
length() 指的是没有泛型的类一般用于本身的类
size() 放很多东西
set集合：无序 不能重复 没有索引
list集合：有序 能重复 有索引
map集合：k-v k永远唯一
 */
public class CollectionDemo01 {
    public static void main(String[] args) {
        //因为set集合没有索引 所以for循环不能用到collection中
        ArrayList c1 = new ArrayList();
        //add 增加
        c1.add("唐僧");
        c1.add("吉吉");
        c1.add("八戒");
        c1.add("沙僧");
        c1.add("白龙");
        System.out.println("c1 = " + c1);
        //尺寸
        int size = c1.size();
        System.out.println("size = " + size);
        //是否为空
        boolean empty = c1.isEmpty();
        System.out.println("empty = " + empty);
        //清空
        c1.clear();
        System.out.println("c1 = " + c1);
        //集合的遍历 1
        /*for (int i = 0; i < c1.size(); i++) {
            System.out.println("c1. = " + c1.get(i));
        }*/
        //集合的遍历 2
        /*
        迭代器和for循环的区别
        迭代器工作：有游标，问有没有下一个，如果有就拿出，没有就结束
        for循环工作：把集合从0-n排序，
         */
        for (Object o : c1) {
            System.out.println("o = " + o);
        }
    }
}
