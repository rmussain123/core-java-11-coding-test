package com.codingtest.demo.collections;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        ignoreDuplicateValues().stream().forEach(System.out::println);

    }

    /**
     * simple example of HashSet
     */
    private static HashSet simpleExample() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("Three");
        hashSet.add("Four");
        hashSet.add("Five");

        return hashSet;
    }

    /**
     * This method demonstrate how HashSet ignoring duplicate values
     *
     * @return
     */
    private static HashSet ignoreDuplicateValues() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("Three");
        hashSet.add("Three");
        hashSet.add("Four");
        hashSet.add("Four");
        hashSet.add("Five");

        return hashSet;
    }
}
