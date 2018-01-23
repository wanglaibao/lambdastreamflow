package com.laibao.jdk9.understandinglambda;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author laibao wang
 * @date 2018-01-23
 * @version 1.0
 */
public class LambdaSyntax {

    /**
     * Identity Function Implemented Using a Lambda
     * @param <V>
     * @return
     */
    public <V> Function<V, V> identityFunction() {
        return value -> value;
    }


    /**
     * Identity Function Implemented Using an Anonymous Inner Class
     * @param <V>
     * @return
     */
    public <V> Function<V, V> identityFunctionAIC() {
        return new Function<V, V>() {
            @Override
            public V apply(V value) {
                return value;
            }
        };
    }


    public static String transform(String str,Function<String,String> stringFunction) {
        return stringFunction.apply(str);
    }

    public static void main(String[] args) {
        // This code does not compile
        //Object funObject = it -> it;

        Function<Integer,Integer> intFun = x -> x + 1000;

        BiFunction<String, String, String> concat = (a, b) -> a + b;



        String stringValue = transform("wanlaibao",String::toUpperCase);

        System.out.println(stringValue);
    }
}
