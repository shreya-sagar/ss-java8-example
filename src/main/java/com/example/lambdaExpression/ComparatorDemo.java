package com.example.lambdaExpression;

import java.util.*;

public class ComparatorDemo {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("One","Two","Three","Four","Five");
        withoutLambdaExpression(strings);
        withLambdaExpression(strings);
    }

    private static void withoutLambdaExpression(List<String> strings){
        System.out.println("Calling withoutLambdaExpression");

        Comparator<String>  stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(),o2.length());
            }
        };

        Collections.sort(strings,stringComparator);
        for (String string : strings) {
            System.out.println(string);
        }
    }

    private static void withLambdaExpression(List<String> strings){
        System.out.println("Calling withLambdaExpression");

        Comparator<String>  stringComparatorLambda = (s1,s2) -> Integer.compare(s1.length(),s2.length());
        Collections.sort(strings,stringComparatorLambda);
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
