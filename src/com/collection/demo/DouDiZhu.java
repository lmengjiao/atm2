package com.collection.demo;

import java.util.*;

/*
斗地主模拟洗牌
牌数 54张 大王小王 2-10 JQKA
♥ ♠ ♦ ♣
 */
public class DouDiZhu {
    public static void main(String[] args) {
        //先造出四个花色
        List<String> colors=new ArrayList<>();
        colors.add("♥");
        colors.add("♠");
        colors.add("♦");
        colors.add("♣");
        //造出4个2-10
        List<String> numbers=new ArrayList<>();
        for (int i = 2; i <=10 ; i++) {
            numbers.add(i + "");
        }
        //增加JQKA
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        numbers.add("A");
        //拼接整合 放入到一个新的集合中（嵌套循环）
        List<String> piker=new ArrayList<>();
       // Set<String> piker=new HashSet<>();
        for (String color : colors) {
            for (String number : numbers) {
                piker.add(color+number);
            }
        }
        piker.add("BigKing");
        piker.add("SmallKing");
        System.out.println("piker = " + piker);
        System.out.println("piker = " + piker.size());
    //如果使用set也无法重新排序就是用下面这个方法
        //只能排序list 因为set是无序的
        Collections.shuffle(piker); //打断list排序
        System.out.println("piker = " + piker);
        //Collections.sort(piker); //list的快速排序（不是人工指定）
        //给玩家发牌
        List<String> p1=new ArrayList<>(); //玩家1
        List<String> p2=new ArrayList<>(); //玩家2
        List<String> p3=new ArrayList<>(); //玩家3
        List<String> dipai=new ArrayList<>(); //3张底牌
        for (int i = 0; i <piker.size() ; i++) {
            String pn = piker.get(i); //拿到每一张牌
            if(i>=51&&pn!="♥3"){
                //留底牌
            }else{
                //发牌
                if(i%3==0){
                    p1.add(pn);
                    if(pn.contains("♥3")){
                        System.out.println("p1是地主");
                    }
                }else if(i%3==1){
                    p2.add(pn);
                    if(pn.contains("♥3")){
                        System.out.println("p2是地主");
                    }
                }else{
                    p3.add(pn);
                    if(pn.contains("♥3")){
                        System.out.println("p3是地主");
                    }
                }
            }
        }

        System.out.println("dipai = " + dipai);
        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
        System.out.println("p3 = " + p3);
    }
}
