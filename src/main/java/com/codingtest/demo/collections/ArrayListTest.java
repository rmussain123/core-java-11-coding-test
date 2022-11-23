package com.codingtest.demo.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {

        List arrayList = new ArrayList();

        //Add objects to the List.
        arrayList.add("Amani");
        arrayList.add("Prabhjot");
        arrayList.add("Nidhi");
        arrayList.add("Vandana");
        arrayList.add("Poonam");

        //Size of the ArrayList object.
        System.out.println("Size: "
                + arrayList.size());


        arrayList.stream().forEach(System.out::println);

    }
    public static String getName(){
        return "Mohamed Ussain";
    }
}
