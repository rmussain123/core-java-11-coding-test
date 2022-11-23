package com.codingtest.demo.codingchallenge.medium;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        /**
         * 1. String Builder with reverse method
         * 2. String builder to append
         * 3. Append one by one letter
         */
//        String word = "Hello World!";
//        System.out.println(reverseStringUsingSBKey(word));
//        System.out.println(manuallyReverse(word));


        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuilder sb= new StringBuilder(A);
//        Arrays.sort(A.toLowerCase());
        if(sb.reverse().toString().equalsIgnoreCase(A)){
            System.out.println("Yes");
        }

    }

    private static String reverseStringUsingSBKey(String word) {
        StringBuilder reverseKey = new StringBuilder(word);
        reverseKey.reverse();
      return reverseKey.toString();
    }
    private static String manuallyReverse(String word){
        StringBuilder sb = new StringBuilder();
        for(int i=word.length()-1 ; i >= 0 ; i-- )
            sb.append(word.charAt(i));
        return sb.toString();
    }
}
