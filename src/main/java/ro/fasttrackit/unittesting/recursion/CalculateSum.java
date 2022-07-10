package ro.fasttrackit.unittesting.recursion;

import java.util.Scanner;

public class CalculateSum {
    public static void main(String[] args) {
        int num;
        System.out.println("Please enter your number: ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        int sum = sumFirstN(num);
        System.out.println("Sum is: " + sum);
        scanner.close();

        int basicSum = basicSumFirstN(num);
        System.out.println("Sum is: " + basicSum);
    }

    public static int sumFirstN(int num) {
        if (num != 0) {
            return num + sumFirstN(num - 1);
        } else {

            return num;
        }

    }

    public static int basicSumFirstN(int num) {
        int sum = 0;
        if (num != 0) {
            for (int i = 0; i <= num; i++) {
                sum += i;
            }
        } else {
            return num;
        }
        return sum;

    }
}