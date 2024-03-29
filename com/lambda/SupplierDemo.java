package com.lambda;


import java.time.LocalDateTime;
import java.util.function.Supplier;

class SupplierImp implements Supplier<String>{

    @Override
    public String get() {
        return "Supplier implements Supplier expression";
    }
}



public class SupplierDemo {
    public static void main(String[] args) {
        SupplierImp supplierImp = new SupplierImp();
        String str = supplierImp.get();
        System.out.println(str);


        Supplier<String> supplier = () -> "Supplier Demo through Lambda expression";
        System.out.println(supplier.get());

        Supplier<LocalDateTime> supplier1 = () -> LocalDateTime.now();
        System.out.println(supplier1.get());

    }
}
