package cote.inflearn.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(solution(str));
    }

    public static String solution(String str) {
        String answer = "";
        String[] strArr = str.split("");

        for (String s: strArr) {
            if(answer.contains(s)) {
                continue;
            }
            answer += s;
        }
        return answer;
    }
}
