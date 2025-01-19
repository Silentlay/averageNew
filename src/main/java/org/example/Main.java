package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double average = Arrays.asList(2, 1, 8, 9, 10, 3, 5, 7).stream().filter(chislo -> chislo %2 == 0).mapToInt(Integer::intValue).average().orElse(0);

        System.out.println("Среднее значение четных чисел: " + average);
    }
}