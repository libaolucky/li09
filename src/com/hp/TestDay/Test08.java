package com.hp.TestDay;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 通过控制台输入3个日期(yyyy-MM-dd格式)，然后转换为Date对象后存入
 * 集合，然后对该集合排序后输出所有日期。
 * @author Xiloer
 */
public class Test08 {
    public static void main(String[] args) throws ParseException {
         Scanner scanner = new Scanner(System.in);
        System.out.println("亲，输入第一个日期(yyyy-MM-dd格式)：");
          String d1 = scanner.nextLine();
        System.out.println("亲，输入第二个日期(yyyy-MM-dd格式)：");
        String d2 = scanner.nextLine();
        System.out.println("亲，输入第三个日期(yyyy-MM-dd格式)：");
        String d3 = scanner.nextLine();
        
        //创建SimpleDateFormat对象
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        //字符串转换成日期格式
        Date date1=sdf.parse(d1);
        //日期格式化
        String da1=sdf.format(date1);
        Date date2=sdf.parse(d2);
        String da2=sdf.format(date2);
        Date date3=sdf.parse(d3);
        String da3=sdf.format(date3);

        List<String> l=new ArrayList<>();
        l.add(da1);
        l.add(da2);
        l.add(da3);
        System.out.println("l = " + l);
        //默认升序排序
        Collections.sort(l);
        //遍历
        for (String list : l) {
            System.out.println("list = " + list);
        }
        
          
         
    }
}
