package com.java.optionalex;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        //of , ofNullable , empty

        String email = "chandan@gmail.com";

        Optional<String> optionalEmpty = Optional.empty();
        System.out.println(optionalEmpty);

        //Optional<String> optionalOf = Optional.of(email);
        //System.out.println(optionalOf);

        Optional<String> ofNullable = Optional.ofNullable(email);

        System.out.println(ofNullable);

         if (ofNullable.isPresent())
             System.out.println(ofNullable.get());
         else
             System.out.println("Value does not exist");

         Optional<String> optOrElse = Optional.ofNullable(email);
         String res = optOrElse.orElse("kumar@gmail.com");
         System.out.println(res);

        String resOrElseGet = optOrElse.orElseGet(() -> "gonu@gmail.com");
        System.out.println(resOrElseGet);

        String optionThrow = optOrElse
                .orElseThrow(() -> new IllegalArgumentException("Email Does Not Exist"));
        System.out.println(optionThrow);


        String rest = " abc ";
        if(rest !=null && rest.contains("abc"))
            System.out.println(rest);
        Optional<String> opt = Optional.of(rest);
        opt.filter(re -> re.contains("abc"))
                .map(String::trim)
                .ifPresent((r) -> System.out.println("Value is : "+r));


    }
}
