package com.hp.TestDay;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

//定义equals方法，要求名字以及年龄相同，则认为内容一致。
public class EmpTest {
    public static void main(String[] args) throws ParseException {
        //创建一个Date对象
        Date date=new Date();

        Emp em=new Emp();
        em.setName("张三");
        em.setAge(25);
        em.setGender("男");
        em.setSalary(5000);
        String s="2006-02-15";
        //字符串转成日期格式
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date h=sdf.parse(s);
         String h1=sdf.format(h);
        em.setHiredate(h1);

        
        //创建List集合
        List<Emp> list1=new ArrayList<>();
        list1.add(em);
        //控制台接收
         Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的名字：");
          String name = scanner.nextLine();
        System.out.println("请输入你的年龄：");
        int Age=scanner.nextInt();


        if (em.getName().equals(name)) {
            if(em.getAge()==Age) {
                System.out.println("您的内容一致");
            }
        }else{
            System.out.println("您的内容不一致");
        }

    }

}
