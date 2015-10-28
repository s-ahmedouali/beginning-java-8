package com.funcoding.java8.lambda;

import java.util.*;

/**
 * Created by s.ahmedouali on 15/10/2015.
 */
public class ComparatorLambda {

    public static void main(String[] args) {
        Comparator<String> compare = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        };
        List<String> products = Arrays.asList("Cereals", "Coffee", "Water", "Chocolate");
        Collections.sort(products, compare);
        products.forEach(System.out::println);

        Comparator<String> inverseLambda = (o1, o2) -> Integer.compare(o2.length(), o1.length());
        Collections.sort(products, inverseLambda);
        products.forEach(System.out::println);
    }


}
