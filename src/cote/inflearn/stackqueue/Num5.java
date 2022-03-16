package cote.inflearn.stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class Num5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push('(');
            } else {
                stack.pop();
                if (str.charAt(i-1) == '(') {
                    answer+=stack.size();
                }else {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
