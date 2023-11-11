package com.codingtest.demo.codingchallenge.medium;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(checkPalindrome("madam taking class"));
    }
    private static String checkPalindrome(String str){
        String[] word = str.split(" ");
        for(String token : word ) {
            StringBuilder stb = new StringBuilder(token);
            if (stb.reverse().toString().equalsIgnoreCase(token)) {
                return token + "  This String is Palindrome";

            }
        }
            return "There is no palindrome string in the given word!";
    }

}
