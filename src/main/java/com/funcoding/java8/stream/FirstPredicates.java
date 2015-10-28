package com.funcoding.java8.stream;

import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by s.ahmedouali on 15/10/2015.
 */
public class FirstPredicates {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Cereals", "Coffee", "Water", "Chocolate");

        Predicate<String> p1 = s -> s.length() > 5;
        Predicate<String> p2 = s -> s.equals("Chocolate");

        //print...
        stream.filter(p1.and(p2)).forEach(System.out::println);

    }


}
