package com.hp.TestDay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 创建一个List集合，并存放10个随机数，然后排序该集合
 * 后输出
 * @author Xiloer
 */
public class Test07 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        for (int i = 0; i <11; i++) {
            //创建Random对象
            Random r=new Random();
            int Sui=r.nextInt(100);
            list.add(0,Sui);
    }
        System.out.println("list = " + list);
         //默认是升序
        Collections.sort(list);
        System.out.println("list = " + list);
       
    }
}
