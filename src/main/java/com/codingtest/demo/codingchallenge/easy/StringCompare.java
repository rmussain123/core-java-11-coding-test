package com.codingtest.demo.codingchallenge.easy;

import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.print(A.length()+B.length());
        if (A.compareTo(B) > 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
