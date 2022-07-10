package ro.fasttrackit.unittesting.recursion;

import java.util.Scanner;

public class CalculateSumOfEvenNumbers {
    public static void main(String[] args) {
        int num;
        System.out.println("enter your number: ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        int sum = sumFirstNEven(num);
        System.out.println("Sum of first N even numbers is: " + sum);
        int basicSum = basicSumFirstNEven(num);
        System.out.println("Sum is: " + basicSum);
        scanner.close();
    }

    public static int sumFirstNEven(int num) {
        if (num == 1) {
            return 2;
        }
        return 2 * num + sumFirstNEven(num - 1);
    }

    public static int basicSumFirstNEven(int num) {
        int sum = 0;
        for (int i = 2; i <= num * 2; i += 2) {
            sum = sum + i;

        }
        return sum;
    }
}
