package cote.inflearn.stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class Num1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String brackets = scanner.nextLine();
        System.out.println(solution(brackets));
    }

    private static String solution(String brackets) {
        Stack<Character> stack = new Stack<>();
        String result = "NO";
        for (Character bracket : brackets.toCharArray()) {
            if (bracket == '(') {
                stack.push(bracket);
            }
            if (bracket == ')') {
                if (stack.empty()){
                    return result;
                }
                stack.pop();
            }
        }

        if (stack.empty()) {
            result = "YES";
        }
        return result;
    }
}
