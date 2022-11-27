package com.codingtest.demo.codingchallenge.strings;

import javax.xml.stream.events.Characters;
import java.util.function.Predicate;

public class FindCapital {
    /**
     * 1. All letters are Capital then true
     * 2. All letters are small then true
     * 3. First letter is capital then true
     * 4. All other letters are false
     */
    public static void main(String[] args) {
        System.out.println(detectCapitals("HinDi"));
    }

    //Approach 1 for traditionals
    private static boolean capitalApproach1(String word) {

        int numberCapitals = 0;
        for(int i=0 ; i < word.length() ; i++){
            if(Character.isUpperCase(word.charAt(i))){
                numberCapitals++;
            }
        }
        if((word.length() == numberCapitals) || numberCapitals == 0){
            return true;
        }
   return numberCapitals ==1 && Character.isUpperCase(word.charAt(0));
    }

    //Approach 2 with java 8
    private static boolean detectCapitals(String word){
        if(word.length() <=1) return true;
        Predicate<Character> correctCase = Character::isLowerCase;
        if(Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))){
            correctCase=Character ::isUpperCase;
        }
        for(int i=1 ; i <word.length() ; i++){
            if(!correctCase.test(word.charAt(i))) return false;
        }

        return true;
    }
}
