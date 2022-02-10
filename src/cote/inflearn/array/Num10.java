package cote.inflearn.array;

import java.util.Scanner;

public class Num10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[][] intArr = new int[size][size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                intArr[i][j] = s.nextInt();
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int num = intArr[i][j];
                int up = 0 == i ? 0 : intArr[i-1][j];
                int down = size-1 == i ? 0 : intArr[i+1][j];
                int left = 0 == j ? 0 : intArr[i][j-1];
                int rigth = size-1 == j ? 0 : intArr[i][j+1];
                if (up < num && down < num && left < num && rigth < num) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
