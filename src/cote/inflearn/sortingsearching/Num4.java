package cote.inflearn.sortingsearching;

import java.util.Scanner;
import java.util.Stack;

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
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[s];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i] == arr[j]) {
                    break;
                }
                if (j == arr.length-1) {
                    stack.push(arr[i]);
                }
            }
        }
        stack.push(arr[n-1]);
        for (int i = 0; i < s; i++) {
            result[i] = stack.pop();
        }
        return result;
    }
}
