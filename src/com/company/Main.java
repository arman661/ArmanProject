package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(multiply(2, 5, 10));
    }
    public static int multiply(int... numbers) {
        if(numbers.length <1) {
            throw new IllegalArgumentException();
        }
        int result = 1;
        for (int number : numbers) {
            result *= number;
        }
        return result;
    }
}
