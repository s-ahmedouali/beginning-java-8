package com.funcoding.java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by s.ahmedouali on 15/10/2015.
 */
public class ChainConsumers {

    public static void main(String[] args) {
        //Products List
        List<String> products = Arrays.asList("Cereals", "Coffee", "Water", "Yogurt", "Chocolate");
        //New Empty List
        List<String> copyProducts = new ArrayList<>();
        //Functions
        Consumer<String> print = System.out::println;
        Consumer<String> add = copyProducts::add;

        products.forEach(print.andThen(add));
        copyProducts.forEach(print);


    }
}
