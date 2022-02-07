package cote.inflearn.array;

import java.util.Scanner;

public class Num7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int count = 0;
        int score = 0;
        for (int i = 0; i < size; i++) {
            int num = s.nextInt();
            if (num == 1 ) {
                count++;
                score += count;
                continue;
            }
            count = 0;
            score += count;
        }
        System.out.println(score);
    }
}
