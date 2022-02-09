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
            int sumOfRows = 0;
            for (int j = 0; j < size; j++) {
                intArr[i][j] = scanner.nextInt();
                sumOfRows += intArr[i][j];
            }
            if (max < sumOfRows) max = sumOfRows;
        }

        for (int i = 0; i < size; i++) {
            int sumOfColumns = 0;
            for (int j = 0; j < size; j++) {
                sumOfColumns += intArr[j][i];
            }
            if (max < sumOfColumns) max = sumOfColumns;
        }

        for (int i = 0, j = 0; i < size; i++, j++) {
            sumOfLeftDiagonals += intArr[i][j];
        }
        if (max < sumOfLeftDiagonals) max = sumOfLeftDiagonals;

        for (int i = 0, j = size - 1; i < size; i++, j--) {
            sumOfRightDiagonals += intArr[i][j];
        }
        if (max < sumOfRightDiagonals) max = sumOfRightDiagonals;

        System.out.println(max);
    }
}
