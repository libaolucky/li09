package com.hp.DayBa;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

//自我学习 JDK8的新特性, 如何新的遍历 只少2个demo
public class JdkXinDemo01 {
    public static void main(String[] args) {
        List<String> list=new ArrayList();
        list.add("美国队长");
        list.add("蜡笔小新");
        list.add("多啦A梦");
        //JDK8新特征 中的foreach遍历方式
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("s = " + s);
            }
        });
        
        
    }
    
    
}
