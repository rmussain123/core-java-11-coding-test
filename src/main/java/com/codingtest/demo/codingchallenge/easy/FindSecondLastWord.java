package com.codingtest.demo.codingchallenge.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

public class FindSecondLastWord {
    public static void main(String[] args) {
//        anagramText("listen , silent");
        System.out.println(secondLast("My Name is Hussain"));
//        System.out.println(wordSearch("is","My Name is Hussain"));
//        anagramText("madam");
    }

    /**
     * Find the word in given sentence
     * @param word
     * @return
     */
    public static String findWord(String word){
        String [] words = word.split(" ");
        return words[1];
    }

    /**
     * Find the second last word in given sentence
     * @param word
     * @return
     */
    public static String secondLast(String word){
        String [] words = word.split(" ");

        return words[word.split(" ").length-2];
    }

    /**
     * Search the particular word in sentence
     * @param word
     * @param sentences
     * @return
     */

    public static boolean wordSearch(String word, String sentences){
        String [] sentenceArray = sentences.split(" ");
         AtomicBoolean status = new AtomicBoolean(false);
         Arrays.stream(sentenceArray).forEach(s -> {
            if(s.equalsIgnoreCase(word)) {
                status.set(true);
            }
        });
         return status.get();
    }

    /**
     * Write the code to find the anagrams
     * 1. Check the word length
     * 2. Make sort using Arrays
     * 3. Check the if both are equal
     * 4. Add the word in different list
     */
    private static void anagramText(String text){
        String[] strText = text.split(" ");
        ArrayList<String> grpList1 = new ArrayList<>();
        ArrayList<String> grpList2 = new ArrayList<>();
        for(int i =0 ; i <= strText.length; i++){

            char[] ArrayS1 = strText[i].toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            if(!grpList1.contains(ArrayS1))
                    grpList1.add(ArrayS1.toString());
            else if(!grpList2.contains(ArrayS1))
                grpList2.add(ArrayS1.toString());


        }
    }
}
