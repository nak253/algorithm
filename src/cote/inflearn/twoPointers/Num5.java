package cote.inflearn.twoPointers;

import java.util.Scanner;

public class Num5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int leftPointer = 1;
        int sum = leftPointer;
        int count = 0;
        for (int rightPointer = 2; rightPointer <= number / 2 + 1; rightPointer++) {
            sum += rightPointer;
            if (number == sum) {
                sum -= leftPointer;
                leftPointer++;
                count++;
            }
            if (number < sum) {
                sum = sum - leftPointer - rightPointer;
                leftPointer++;
                rightPointer--;
            }
        }
        System.out.println(count);

    }
}
