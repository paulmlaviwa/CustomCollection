package com.pluralsight.collection;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        // Testing FixedList of Integers
        FixedList<Integer> numbers = new FixedList<>(3);
        numbers.add(10);
        numbers.add(3);
        numbers.add(92);
        numbers.add(43);

        System.out.println("Number of items in numbers list: " + numbers.getItems().size());

        // Testing FixedList of LocalDate
        FixedList<LocalDate> dates = new FixedList<>(2);
        dates.add(LocalDate.now());
        dates.add(LocalDate.now());
        dates.add(LocalDate.now());

        System.out.println("Number of items in dates list: " + dates.getItems().size());
    }
}

