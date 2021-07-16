package com.hp.TestDay;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 * 例如:
 * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...
 * 然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 然后循环集合，输出每一个员工信息(输出使用toString返回的字符串)
 * 然后输出每个员工的转正仪式日期。
 * 转正仪式日期为:入职3个月的当周周五
 *
 * @author Xiloer
 */
public class Test09 {
    public static void main(String[] args) throws ParseException {
        Emp em1=new Emp();
        em1.setName("张三");
        em1.setAge(25);
        em1.setGender("男");
        em1.setSalary(5000);
        //把字符串转换成日期格式的
        String s="2006-02-15";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date h=sdf.parse(s);  //来公司的日期
        String  h1=sdf.format(h);
        em1.setHiredate(h1);
        

        Emp em2=new Emp();
        em2.setName("李四");
        em2.setAge(26);
        em2.setGender("女");
        em2.setSalary(6000);
        //把字符串转换成日期格式的样式
        String s1="2007-12-24";
        SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");
        Date hh=sd.parse(s1);  //来公司的日期
        String  hh1=sd.format(hh);
        em2.setHiredate(hh1);

        List<Emp> l=new ArrayList<>();
        l.add(em1);
        l.add(em2);

        //遍历
        for (Emp emp : l) {
            System.out.println("emp = " + emp);
        }
        //创建Calendar对象
        Calendar calendar=Calendar.getInstance();
        //获取来公司的日期
        calendar.setTime(h);
        //获取当月是入职的第几个月
        calendar.set(Calendar.DAY_OF_MONTH,4);
        //获取三个月当周的星期五
        calendar.set(Calendar.DAY_OF_WEEK,6);
        //将日期格式化一下
       String da1=sdf.format(calendar.getTime());
        System.out.println("da1 = " + da1);

    }
}
