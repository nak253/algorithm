package cote.inflearn.twoPointers;

import java.util.Scanner;

public class Num3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int day = scanner.nextInt();
        int[] sales = new int[size];
        for (int i = 0; i < size; i++) {
            sales[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < day; i++) {
            sum += sales[i];
        }
        int max = sum;
        for (int i = 1; i < size - day + 1; i++) {
            sum -= sales[i - 1];
            sum += sales[i + day - 1];
            if (max < sum) {
                max = sum;
            }
        }
        System.out.println(max);
    }
}
