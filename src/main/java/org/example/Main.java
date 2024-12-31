package org.example;
public class Main {
    public static void main(String[] args) {
        int sum = calculateSum(5);
        System.out.println("sum: " + sum);
    }

    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}