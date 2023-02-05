package com.lambda;

import java.util.function.Consumer;

class ConsumeImp implements Consumer<String>{

    @Override
    public void accept(String input) {
        System.out.println(input);
    }
}



public class ConsumeDemo {
    public static void main(String[] args) {
        ConsumeImp com = new ConsumeImp();
        com.accept("Kumar");

        Consumer<String> consumer = ( input) -> System.out.println(input);
        consumer.accept("Consumer with Lambda Demo");
    }
}
