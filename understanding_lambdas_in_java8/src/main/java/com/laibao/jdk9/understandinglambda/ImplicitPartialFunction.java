package com.laibao.jdk9.understandinglambda;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;

public class ImplicitPartialFunction {

    public static void main(String[] args) {
        BiFunction<String, String, String> concat = (a, b) -> a + b;
        Function<String, String> greeter = who -> concat.apply("Hello, ",who);
        greetFolks(greeter);
        System.out.println();
        greetFolks((String who) -> concat.apply("Hello, ",who));
    }

    public static void greetFolks(Function<String, String> greeter) {
        for(String name : Arrays.asList("Alice", "Bob", "Cathy")) {
            System.out.println(greeter.apply(name));
        }
    }
}
