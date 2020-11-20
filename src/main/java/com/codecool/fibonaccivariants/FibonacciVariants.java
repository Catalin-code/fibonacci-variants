package com.codecool.fibonaccivariants;

public class FibonacciVariants {
    public static int additionsCounter = 0;

    public static void resetCounter() {
        additionsCounter = 0;
    }

    public static int iterative(int n) {
        if( n <= 1) {
            return n;
        }
        int fibonacci = 1;
        int previousFibonacci = 1;

        for (int i = 2; i < n; i++){
            int temp = fibonacci;
            fibonacci = fibonacci + previousFibonacci;
            previousFibonacci = temp;
        }
        return fibonacci;
    }

    public static int naiveRecursive(int n) {
        if ( n <= 1){
            return n;
        }
        return naiveRecursive(n - 1) + naiveRecursive(n - 2);
    }

    public static int recursiveWithMemoization(int n) {

        return 0;
    }

    public static int tailRecursive(int n) {

        return 0;
    }

}
