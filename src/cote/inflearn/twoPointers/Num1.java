package cote.inflearn.twoPointers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Num1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size1 = scanner.nextInt();
        int[] intArr1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            intArr1[i] = scanner.nextInt();
        }

        int size2 = scanner.nextInt();
        int[] intArr2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            intArr2[i] = scanner.nextInt();
        }
        List<Integer> answer = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < size1 || j < size2) {
            if (i == size1) {
                answer.add(intArr2[j]);
                j++;
                continue;
            }
            if (j == size2) {
                answer.add(intArr1[i]);
                i++;
                continue;
            }
            if (intArr1[i] < intArr2[j]) {
                answer.add(intArr1[i]);
                i++;
                continue;
            }
            answer.add(intArr2[j]);
            j++;
        }

        for (int result : answer) {
            System.out.print(result + " ");
        }
    }
}
