package com.hp.TestDay;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 创建一个集合c1，存放元素"one","two","three"
 * 再创建一个集合c2，存放元素"four","five","six"
 * 然后将c2元素全部存入c1集合
 * 然后在创建集合c3,存放元素"one,five"
 * 然后输出集合c1是否包含集合c3的所有元素
 * 然后将c1集合中的"two"删除后再输出c1集合
 * @author Xiloer
 */
public class Test01 {
    public static void main(String[] args) {

        Collection<String> c2=new ArrayList<>();
        c2.add("four");
        c2.add("five");
        c2.add("six");

        List<String> c1=new ArrayList<>();
        c1.add("one");
        c1.add("two");
        c1.add("three");
        //将c2的元素加到c1中
        c1.addAll(c2);

        List<String> c3=new ArrayList<>();
        c3.add("one");
        c3.add("five");
        //输出集合c1是否包含集合c3的所有元素
        System.out.println(c1);
        System.out.println(c1.containsAll(c3));
        //将c1集合中的"two"删除后再输出c1集合
        c1.remove(1);
        System.out.println(c1);


    }

}
