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

        int[] answer = new int[size-day+1];
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < day; j++) {
                answer[i] += arr[i+j];
            }
        }
        int max = 0;
        for (int i = 0; i < answer.length; i++) {
            if (max < answer[i]) {
                max = answer[i];
            }
        }
        System.out.println(max);
    }
}
