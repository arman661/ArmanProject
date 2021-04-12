package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(multiply(2, 5, 10));
        System.out.println(factorial(32));
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
    public static  int factorial(int number) {
        if(number < 0) {
            throw new IllegalArgumentException("Введенное число меньше 0");
        }
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
