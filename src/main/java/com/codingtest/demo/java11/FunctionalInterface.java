package com.codingtest.demo.java11;

public interface FunctionalInterface {
    int show();
    default String message(){
        return "Functional interface Demo";
    }
}
