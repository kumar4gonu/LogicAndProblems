package com.lambda;


interface Addable{
    int addition(int a, int b);
}

class AddableImpl implements Addable{

    @Override
    public int addition(int a, int b) {
        return a + b;
    }
}



public class LambdaAddable {
    public static void main(String[] args) {
        Addable addable =  ( a,  b) ->  a + b;
        int result = addable.addition(10 , 20);
        System.out.println(result);

        Addable add = (a , b) -> {
            int res = a + b;
            return res;
        };

        System.out.println(add.addition(10,50));
    }
}
