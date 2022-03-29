package cote.inflearn.sortingsearching;

import java.util.Scanner;

public class Num4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int num = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int number: solution(size,num,arr)) {
            System.out.println(number + " ");
        }
    }

    private static int[] solution(int size, int num, int[] arr) {
    }
}
