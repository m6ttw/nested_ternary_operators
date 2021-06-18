package com.example;

public class Main {

//    Just a small exercise to find a good layout for a nested ternary operator

    public static void main(String[] args) {
	    int number = 5;
//	    standard if else statement first
        String result = null;
        if (number % 2 == 0)
            result = "a";
        else if (number % 5 == 0)
            result = "b";
        System.out.println(result); // prints b

        int newNumber = 4;
//      standard one line ternary operator
        String newResult = newNumber % 2 == 0 ? "c" : "d" ;
        System.out.println(newResult);

        int num = 5;
//      nested ternary operator
        String res = num % 2 == 0 ? "divides by two"
                   : num % 3 == 0 ? "divides by three"
                   : num % 5 == 0 ? "divides by five"
                   : num % 7 == 0 ? "divides by seven"
                   : "doesn't divide";
        System.out.println(res);

//      Looks pretty good
    }
}
