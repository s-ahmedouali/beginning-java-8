package com.funcoding.java8;

interface Filter {
    boolean accept(String name);
}

/**
 * Created by s.ahmedouali on 15/10/2015.
 */
public class Lambda {

    public static void main(String[] args) {
        final String java = "Client.java";
        final String clazz = "Client.class";
        //anonymous
        Filter filter = new Filter() {
            @Override
            public boolean accept(String name) {
                return name.endsWith(".java");
            }
        };

        System.out.println(filter.accept(java));
        System.out.println(filter.accept(clazz));

        //Lambda
        Filter lambdaFilter = name -> name.endsWith(".java");

        System.out.println(lambdaFilter.accept(java));
        System.out.println(lambdaFilter.accept(clazz));

    }
}
