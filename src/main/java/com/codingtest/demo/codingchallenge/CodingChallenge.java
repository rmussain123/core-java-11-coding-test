package com.codingtest.demo.codingchallenge;

import java.util.Scanner;

public class CodingChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputValue = String.valueOf(sc.hasNext());
        if(inputValue==null)
            throw new RuntimeException();
        else
            fizzBuzzSolution(Integer.parseInt(sc.next()));

    }

    private static void fizzBuzzSolution(int num) {
        /**
         * 1. for 1 to n
         * 2.if i%3 ==0 && i%5 ==0 Then print "Fizz Buzz"
         * 3. if i%3 ==0 Then print Fizz
         * 4. If i%5 == 0 then print "Buzz"
         */

        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }


    }
}
