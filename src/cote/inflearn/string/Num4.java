package cote.inflearn.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num4 {
    public static String solution(String word) {
        char[] cArr = word.toCharArray();
        for (int i = 0, j = cArr.length - 1; i < cArr.length / 2; i++, j--) {
            char tmp =  cArr[i];
            cArr[i] = cArr[j];
            cArr[j] = tmp;
        }
        return String.valueOf(cArr);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            String word = br.readLine();
            System.out.println(solution(word));
        }
    }
}
