package com.lambda;


import java.util.function.Function;

class FunctionImpl implements Function<String , Integer >{
    @Override
    public Integer apply(String s) {
        return s.length();
    }
}


public class FunctionDemo {
    public static void main(String[] args) {
//        FunctionImpl function = new FunctionImpl();
//        System.out.println(function.apply("Kumar"));
        
        Function<String, Integer> function = (String s) ->  s.length();
        System.out.println(function.apply("Kumar"));

    }
}
