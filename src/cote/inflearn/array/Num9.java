package cote.inflearn.array;

import java.util.Scanner;

public class Num9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] intArr = new int[size][size];
        int max = 0;
        int sumOfLeftDiagonals = 0;
        int sumOfRightDiagonals = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                intArr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < size; i++) {
            int sumOfRows = 0;
            int sumOfColumns = 0;
            for (int j = 0; j < size; j++) {
                sumOfRows += intArr[i][j];
                sumOfColumns += intArr[j][i];
            }
            if (max < sumOfRows) max = sumOfRows;
            if (max < sumOfColumns) max = sumOfColumns;
        }

        for (int i = 0; i < size; i++) {
            sumOfLeftDiagonals += intArr[i][i];
            sumOfRightDiagonals += intArr[i][size - i - 1];
        }
        if (max < sumOfLeftDiagonals) max = sumOfLeftDiagonals;
        if (max < sumOfRightDiagonals) max = sumOfRightDiagonals;

        System.out.println(max);
    }
}
