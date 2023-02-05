package com.java.methodrefrance;

import java.util.function.BiFunction;
import java.util.function.Function;


interface Printable{
    void display(String msg);
}


public class MethodReferenceDemo {

    public void display(String msg){
        msg = msg.toUpperCase();
        System.out.println("Display on Method Reference Demo..." + msg);
    }



    public static void main(String[] args) {

       //Function used normal lambda expression.
        Function<Integer, Double> function = (input) -> Math.sqrt(input);
        System.out.println(function.apply(10));

        //Function used Method Reference.
        Function<Integer, Double> function1 = Math::sqrt;
        System.out.println(function1.apply(100));


        BiFunction<Integer,Integer, Integer> biFunction = (a , b) -> ( a + b);
        System.out.println(biFunction.apply(100, 200));

        //Lambda expression.
        BiFunction<Integer,Integer,Integer> biFunction1 = (a , b) -> MethodReferenceDemo.addition(a , b);
        System.out.println(biFunction1.apply(20, 80));

        //Using Method Reference.
        BiFunction<Integer,Integer,Integer> biFunction2 = MethodReferenceDemo::addition;
        System.out.println(biFunction2.apply(500, 200));

        //Method reference to on instance method of an object

        MethodReferenceDemo methodReferenceDemo = new MethodReferenceDemo();
        Printable printable = (input) -> methodReferenceDemo.display(input);
        printable.display("hello kumar.");

        // using lambda expression

        Printable printable1 = methodReferenceDemo::display;
        printable1.display("hello chandan");

        Function<String,String> function2 = (input) -> input.toUpperCase();
        System.out.println(function2.apply("Chandan kumar"));

        Function<String,String> function3 = String::toUpperCase;
        System.out.println(function3.apply("Chandan kumar"));






    }

    public static int addition(int a, int b){
        return a + b;
    }
}
