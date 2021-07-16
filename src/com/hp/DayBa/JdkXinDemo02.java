package com.hp.DayBa;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JdkXinDemo02 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("花花");
        person.setHeigh(187);
        person.setAge(24);

        List<Person> list = new ArrayList();
        list.add(person);

        //用list.stream()流的方式来遍历
        List<String> namesLists=list.stream().map(Person::toString).collect(Collectors.toList());
        System.out.println("namesLists = " + namesLists);

    }

}
