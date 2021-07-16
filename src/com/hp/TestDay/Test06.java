package com.hp.TestDay;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 创建一个字符串数组:{"one","two","three"}
 * 然后将该数组转换为一个List集合
 * @author Xiloer
 *
 */
public class Test06 {
    public static void main(String[] args) {
        //创建一个字符串数组:{"one","two","three"}
        String[] aa={"one","two","three"};
        //创建一个String类型的ArrayList
        ArrayList<String> aalist= new ArrayList<String>();
        //把aa添加到ArrayList里去
        Collections.addAll(aalist,aa);
        System.out.println("aalist = " + aalist);
    }
}
