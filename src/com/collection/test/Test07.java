package com.collection.test;

import java.util.ArrayList;
import java.util.Random;

/*
 * 创建一个List集合，并存放10个随机数，然后排序该集合
 * 后输出
 */
public class Test07 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        Random random=new Random();
        while(list.size()<=10){
            list.add(random.nextInt(11));
        }
        for (Object l : list) {
            System.out.println("l = " + l);
        }
    }
}
