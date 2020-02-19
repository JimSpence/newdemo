package com.example.demo2;

import java.util.Optional;

public class TestRes {

    public TestRes() {
    }

    public static void main(String[] args) {
        Optional<String> summary = Optional.of("A summary");
        if (summary.isPresent()){
            System.out.println("Hi");
        }
        Optional<String> summary2 = Optional.empty();
        if (summary2.isPresent()){
            System.out.println("NotHi");
        }
        String summary2orDefault = summary2.orElse("orElse");
        summary.ifPresent(s -> System.out.println(s));
        summary2.ifPresent(s -> System.out.println(s));
        System.out.println(summary2orDefault);

        Stream

    }
}