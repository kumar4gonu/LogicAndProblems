package com.lambda;


import java.util.function.Predicate;

class PredicateImp implements Predicate<String>{

    @Override
    public boolean test(String s) {
        return s.length() > 5;
    }
}


public class PredicateDemo {
    public static void main(String[] args) {
        PredicateImp predicateImp = new PredicateImp();
        boolean res = predicateImp.test("kua");
        System.out.println(res);

        res = predicateImp.test("chandan");
        System.out.println(res);

        Predicate<String> predicate = (input) -> input.length() > 5;
        System.out.println(predicate.test("kum"));
        System.out.println(predicate.test("chandan"));


    }

}
