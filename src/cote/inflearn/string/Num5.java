package cote.inflearn.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(solution(str));
    }

    private static String solution(String str) {
        char[] cArr = str.toCharArray();
        int count = cArr.length-1;

        for (int i = 0; i <=count; i++) {
            if (isAlphabet(cArr[i])){
                for (int j = count; i < j; j--) {
                    if (isAlphabet(cArr[j])){
                        char tmp = cArr[i];
                        cArr[i] = cArr[j];
                        cArr[j] = tmp;
                        count = j-1;
                        break;
                    }
                }
            }
        }
        return new String(cArr);
    }

    private static boolean isAlphabet(char c) {
        if ('a' <= c && c <= 'z') {
            return true;
        }
        if ('A' <= c && c <= 'Z') {
            return true;
        }
        return false;
    }
}
