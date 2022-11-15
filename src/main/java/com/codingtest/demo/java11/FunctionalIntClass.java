package com.codingtest.demo.java11;

public class FunctionalIntClass implements FunctionalInterface{
    @Override
    public int show() {
        return 0;
    }

    public static void main(String[] args) {
        FunctionalIntClass functionalIntClass = new FunctionalIntClass();
        System.out.println(functionalIntClass.show());
        System.out.println(functionalIntClass.message());
    }
}
