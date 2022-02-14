package cote.inflearn.twoPointers;

import java.util.Scanner;

public class Num3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int day = s.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        int max = 0;
        for (int i = 0; i < size - (day - 1); i++) {
            int sum = 0;
            for (int j = 0; j < day; j++) {
                sum += arr[i + j];
            }
            if (max < sum) {
                max = sum;
            }
        }
        System.out.println(max);
    }
}
