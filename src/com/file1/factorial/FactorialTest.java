package com.file1.factorial;

import java.io.IOException;

public class FactorialTest {
    public FactorialTest() {
        Factorial fact = new Factorial();
        System.out.println("Cycle factorial: ");
        System.out.println(fact.cycleFact());
        System.out.println("Recursion factorial: ");
        System.out.println(fact.recursionFact(fact.get()));
        System.out.println("Work time: " + (fact.get_time()));
    }
}