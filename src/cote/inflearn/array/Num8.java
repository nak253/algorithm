package cote.inflearn.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Num8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        Integer[] intArr = new Integer[size];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = scanner.nextInt();
        }
        Integer[] sortArr = Arrays.copyOf(intArr, size);
        Arrays.sort(sortArr, Collections.reverseOrder());

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (intArr[i] == sortArr[j]) {
                    System.out.print(j + 1 + " ");
                    break;
                }
            }
        }
    }
}
