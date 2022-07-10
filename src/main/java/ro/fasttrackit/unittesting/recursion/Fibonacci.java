package ro.fasttrackit.unittesting.recursion;


public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Non recursive");
        fibonacciNonRecursive(10);

        System.out.println("\nRecursive");
        int result[] = printFibonacci(10);
        for (int j : result) {
            System.out.print(j + " ");
        }
    }

    public static void fibonacciNonRecursive(int n) {
        int first = 0;
        int second = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static int[] printFibonacci(int num) {
        int fibArray[] = new int[num];
        for (int i =0; i< num; i++) {
            fibArray[i] = fibonacciRecursive(i);
        }
        return fibArray;
    }

    public static int fibonacciRecursive(int n) {
        if (n == 0) {
            return 0;
        } else if (n <= 2) {
            return 1;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }


}
