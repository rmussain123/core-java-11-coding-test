package com.codingtest.demo.codingchallenge.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AnagramDemo {
    public static void main(String[] args) {
        System.out.println(checkAnagram( "Keep", "peek"));
        System.out.println(checkAnagram("Mother In Law", "Hitler Woman"));

    }
    private static boolean checkAnagram( String str1, String str2){
       String s1 = str1.replaceAll("\\s", "");
        String s2 = str2.replaceAll("\\s", "");
        System.out.println("s1 :: "+s1);
        System.out.println("s2 :: "+s2);
        boolean status;
        if (s1.length() != s2.length()) {
            status = false;
        } else {
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            status = Arrays.equals(ArrayS1, ArrayS2);
            return status;
        }
            return status;
    }
}
