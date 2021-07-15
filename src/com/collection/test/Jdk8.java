package com.collection.test;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Jdk8 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        //for
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //foreach
        list.forEach(new Consumer() {
            @Override
            public void accept(Object o) {

            }
        });

        }
    }

