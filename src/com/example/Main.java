package com.example;

public class Main {

    public static void main(String[] args) {
	    int number = 5;
//	    standard if else statement first
        String result = null;
        if (number % 2 == 0)
            result = "a";
        else if (number % 5 == 0)
            result = "b";
        System.out.println(result); // prints b
    }
}
