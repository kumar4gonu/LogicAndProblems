package com.functionInterface;

public class FunctionalExample {
    public static void main(String[] args) {
        MyFunctionalInterface mfi = () -> {
            System.out.println("Display called");
        };

        mfi.display();
        int res = mfi.add(10,20);
        System.out.println(res);

        String resStr = MyFunctionalInterface.add("Kumar", "Chandan");
        System.out.println(resStr);

    }
}
