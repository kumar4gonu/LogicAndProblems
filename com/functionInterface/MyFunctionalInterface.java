package com.functionInterface;


@FunctionalInterface
public interface MyFunctionalInterface {
    void display();

    default public void show(){
        System.out.println("show method...");
    }

    default public int add(int a, int b){
        return a + b;
    }
    public static String add(String str, String str1){
        return str + str1;
    }
}
