package com.hp.TestDay;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个List集合并添加元素0-9
 * 然后获取子集[3,4,5,6]
 * 然后将子集元素扩大10倍
 * 然后输出原集合。
 * 之后删除集合中的[7,8,9]
 * @author Xiloer
 */
public class Test04 {
    public static void main(String[] args) {
        //创建一个List集合并添加元素0-9
       List list=new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            list.add(i);
        }
        System.out.println("list = " + list);
        //然后获取子集[3,4,5,6]
        List<Integer> a=new ArrayList<Integer>();
         a=list.subList(3,7);
        System.out.println("a = " + a);
        
        //遍历
        for (int i = 0; i <a.size() ; i++) {
            //将子集元素扩大10倍
            a.set(i,a.get(i) * 10);
        }
        System.out.println("a = " + a);

        //删除集合中的[7,8,9]
        List<Integer> b=new ArrayList<Integer>();
        b=list.subList(7,list.size());
        System.out.println("b = " + b);
        list.removeAll(b);
        System.out.println("list = " + list);
        
        
    }
}
