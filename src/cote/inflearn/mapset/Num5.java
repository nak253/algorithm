package cote.inflearn.mapset;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Num5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int num = scanner.nextInt();
        Integer[] integers = new Integer[size];

        for (int i = 0; i < size; i++) {
            integers[i] = scanner.nextInt();
        }

        System.out.println(solution(size, num, integers));

    }

    private static int solution(int size, int num, Integer[] integers) {
        int result = -1;
        TreeSet<Integer> ts = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < size - 2; i++) {
            for (int j = i + 1; j < size - 1; j++) {
                for (int k = j + 1; k < size; k++) {
                    ts.add(integers[i] + integers[j] + integers[k]);
                }
            }
        }
        int count = 0;
        for (Integer x : ts) {
            count++;
            if (count == num) return x;
        }
        return result;
    }
}