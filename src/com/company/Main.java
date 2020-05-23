package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int objCount = (int) (1 + Math.random() * 12);//количество obj

        ArrayList list2 = new ArrayList();
for (int i = 0;i<objCount;i++) {
    ArrayList list = new ArrayList();
    list.add(new Circle());
    list.add(new SquareX());
    list.add(new Triangle());
    list.add(new Trapeze());
    int rnd = (int) (Math.random() * 4);
    list2.add(i, list.get(rnd));
}
for (int i = 0;i<list2.size(); i++)
    System.out.println(list2.get(i));
        
    }
}
