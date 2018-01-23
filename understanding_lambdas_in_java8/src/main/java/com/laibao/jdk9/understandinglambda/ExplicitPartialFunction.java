package com.laibao.jdk9.understandinglambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class ExplicitPartialFunction {

    public static void main(String[] args) {
        BiFunction<String, String, String> concat = (a,b) -> a + b;
        List<String> list = Arrays.asList("Alice", "Bob", "Cathy");
        greetFolks(applyPartial(concat, "Hello, "),list);
    }

    public static <T,U,V> Function<U,V> applyPartial(BiFunction<T,U,V> bif, T firstArgument) {
        return u -> bif.apply(firstArgument, u);
    }

    public static void greetFolks(Function<String, String> greeter,List<String> list) {
//        for(String name : Arrays.asList("Alice", "Bob", "Cathy")) {
//            System.out.println(greeter.apply(name));
//        }
        list.forEach((String name) -> {
            String value = greeter.apply(name);
            System.out.println(value);
        });
    }
}
