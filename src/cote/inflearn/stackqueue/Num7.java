package cote.inflearn.stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Num7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "NO";
        String subjects = scanner.nextLine();
        Queue<Character> q = new LinkedList<>();
        for (char c : subjects.toCharArray()) {
            q.offer(c);
        }

        char[] plan = scanner.nextLine().toCharArray();
        Character subject = q.peek();
        for (int i = 0; i < plan.length; i++) {
            if (q.isEmpty()) {
                result = "YES";
                break;
            }
            if (subject == plan[i]) {
                q.poll();
                subject = q.peek();
            }
        }
        System.out.println(result);
    }
}
