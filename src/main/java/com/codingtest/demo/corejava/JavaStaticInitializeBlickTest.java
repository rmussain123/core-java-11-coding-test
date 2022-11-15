package com.codingtest.demo.corejava;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaStaticInitializeBlickTest {

    private static int B;
    private static int H;
    private static boolean flag;

    private static Scanner sc = new Scanner(System.in);
    static
    {

        System.out.println(sc);
        int b = sc.nextInt();
        int h = sc.nextInt();

        if(b > 0 || h >0 )
            System.out.println(b*h);
        else
            System.out.println("java.lang.Exception: Breadth and height must be positive");

    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class

