package cote.inflearn.stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class Num4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(solution(str));
    }

    private static int solution(String str) {
        Stack<Integer> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                stack.push(calculate(stack, c));
            }
        }
        return stack.pop();
    }

    private static int calculate(Stack<Integer> stack, char c) {
        int right = stack.pop();
        int left = stack.pop();
        int result = 0;

        if (c == '*') {
            result = left * right;
        }
        if (c == '/') {
            result = left / right;
        }
        if (c == '+') {
            result = left + right;
        }
        if (c == '-') {
            result = left - right;
        }
        return result;
    }
}
