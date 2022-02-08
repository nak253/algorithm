package cote.inflearn.array;

import java.util.Scanner;

public class Num8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] intArr = new int[size];
        int[] answer = new int[size];

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = scanner.nextInt();
        }

        for (int i = 0; i < size ; i++) {
            int rank = 1;
            for (int j = 0; j < size; j++) {
                if (intArr[i] < intArr[j]) {
                    rank++;
                }
            }
            answer[i] = rank;
        }

        for (int result:answer) {
            System.out.print(result + " ");
        }

    }
}
