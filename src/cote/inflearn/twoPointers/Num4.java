package cote.inflearn.twoPointers;

import java.util.Scanner;

public class Num4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int num = s.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        int count = 0;
        int sum = 0;
        int firstIndex = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
            if (sum == num) {
                count++;
                sum = sum - arr[firstIndex];
                firstIndex++;
            } else if (num < sum) {
                sum = sum - arr[firstIndex] - arr[i] - arr[i-1];
                firstIndex++;
                i = i-2;
            }
        }
        System.out.println(count);
    }
}
