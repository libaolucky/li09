package com.hp.TestDay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 创建一个List集合，并添加元素0-9
 * 将集合转换为一个Integer数组并输出数组每一个元素
 * @author Xiloer
 */
public class Test05 {
    public static void main(String[] args) {
        //创建一个List集合，并添加元素0-9
        List<Integer> l=new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            l.add(i);
        }
        System.out.println("l = " + l);
        //集合要转换成Integer数组要是用toArray的带参方法
        //Integer[] integer = l.toArray(new Integer[l.size()]);
        //System.out.println(Arrays.toString(integer));

        int[] array = new int[l.size()];
        for (int i = 0; i < l.size(); i++) {
            array[i] = l.get(i);
        }
        System.out.println(Arrays.toString(array));





    }
}
