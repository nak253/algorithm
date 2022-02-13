package cote.inflearn.twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Num2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size1 = s.nextInt();
        int[] arr1 = createSortArr(s, size1);
        int size2 = s.nextInt();
        int[] arr2 = createSortArr(s, size2);

        int p1 = 0;
        int p2 = 0;
        List<Integer> answer = new ArrayList<>();
        while (p1 < size1 && p2 < size2) {
            if (arr1[p1] == arr2[p2]) {
                answer.add(arr1[p1]);
                p1++;
                p2++;
                continue;
            }
            if (arr1[p1] < arr2[p2]) {
                p1++;
                continue;
            }
            if (arr1[p1] > arr2[p2]) {
                p2++;
                continue;
            }
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }

    private static int[] createSortArr(Scanner s, int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr);
        return arr;
    }
}
