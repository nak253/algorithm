package cote.inflearn.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num2 {
    public static String solution(String str) {
        String answer = "";
        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                answer += Character.toUpperCase(c);
                continue;
            }
            answer += Character.toLowerCase(c);
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(solution(str));

    }
}
