package cote.inflearn.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[] answer = new int[size];
        answer[0] = 1;
        answer[1] = 1;

        for (int i = 2; i < size; i++) {
            answer[i] = answer[i - 1] + answer[i - 2];
        }

        for (int i: answer) {
            System.out.print(i+" ");
        }
    }
}
