package com.collection.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 *创建一个List集合，并添加元素0-9
 * 将集合转换为一个Integer数组并输出数组每一个元素
 */
public class Test05 {
    public static void main(String[] args) {
        // Integer集合转Integer数组，要使用toArrzy()的带参方法
        //注意Integer集合不能直接转为int数组，
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        //集合要转换成Integer数组要是用toArrzy()的带参方法
        Integer[] integer = list.toArray(new Integer[list.size()]);
        System.out.println(Arrays.toString(integer));

        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        System.out.println(Arrays.toString(array));

    }
}
