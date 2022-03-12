package cote.inflearn.stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class Num2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(solution(str));
    }

    private static StringBuilder solution(String str) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (Character c : str.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            }else if (c == ')') {
                stack.pop();
            }else if(stack.empty()) {
                sb.append(c);
            }
        }
        return sb;
    }
}
