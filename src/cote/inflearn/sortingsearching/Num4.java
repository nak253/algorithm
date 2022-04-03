package cote.inflearn.sortingsearching;

import java.util.Scanner;

public class Num4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int number : solution(s, n, arr)) {
            System.out.print(number + " ");
        }
    }

    private static int[] solution(int s, int n, int[] arr) {
        int[] result = new int[s];
        for (int number : arr) {
            int pos = -1;
            for (int i = 0; i < result.length; i++) {
                if (number == result[i]) {
                    pos = i;
                }
            }
            if (pos == -1) { //캐시 미스의 경우
                for (int i = result.length - 1; 1 <= i; i--) {
                    result[i] = result[i - 1];
                }
            } else {
                for (int j = pos; 1 <= j; j--) {
                    result[j] = result[j - 1];
                }
            }
            result[0] = number;
        }
        return result;
    }
}
