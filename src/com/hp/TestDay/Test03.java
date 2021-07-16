package com.hp.TestDay;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个List集合(ArrayList,LinkedList均可)
 * 存放元素"one","two","three","four"。
 * 获取集合第二个元素并输出。
 * 将集合第三个元素设置为"3"
 * 在集合第二个位置上插入元素"2"
 * 删除集合第三个元素。
 * @author Xiloer
 */
public class Test03 {
    public static void main(String[] args) {
        List<String> li=new ArrayList<>();
        li.add("one");
        li.add("two");
        li.add("three");
        li.add("four");
        //获取集合第二个元素并输出。
        System.out.println(li.get(1));
        //将集合第三个元素设置为"3"
        li.set(2,"3");
        System.out.println("li = " + li);
        //在集合第二个位置上插入元素"2"
        li.add(1,"2");
        System.out.println("li = " + li);
        //删除集合第三个元素
        li.remove(2);
        System.out.println("li = " + li);
        


    }
}
