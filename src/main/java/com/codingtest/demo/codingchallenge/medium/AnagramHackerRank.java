package com.codingtest.demo.codingchallenge.medium;

import java.util.Scanner;

public class AnagramHackerRank {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        char[] a1 = a.toLowerCase().toCharArray();
        char[] b1 = b.toLowerCase().toCharArray();
        if(a1.length != b1.length){
            return false;
        }else{
            java.util.Arrays.sort(a1);
            java.util.Arrays.sort(b1);
            if(a1.equals(b1)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
