package cote.inflearn.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(solution(str));

    }

    private static String solution(String str) {
        char[] cArr = (str+" ").toCharArray();
        StringBuilder sb = new StringBuilder(str.length());

        int count = 1;

        for (int i = 0; i < cArr.length-1; i++) {
            if (cArr[i] == cArr[i+1]) {
                count++;
                continue;
            }
            sb.append(cArr[i]);
            if (1 < count) {
                sb.append(count);
                count = 1;
            }
        }
        return sb.toString();
    }
}
