package cote.inflearn.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num12 {

    final static int NUM = 7;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String str = br.readLine();
        System.out.println(solution(num, str));
    }

    private static String solution(int num, String str) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < num; i++) {
            String binary = convertToBinary(str.substring(i * NUM, (i + 1) * NUM));
            int decimal = convertToDecimal(binary);
            char c = (char) (decimal);
            answer.append(c);
        }
        return answer.toString();
    }

    private static String convertToBinary(String str) {
        char[] cArr = str.toCharArray();
        StringBuilder answer = new StringBuilder(cArr.length);
        for (char c : cArr) {
            if (c == '#') {
                answer.append("1");
                continue;
            }
            if (c == '*') {
                answer.append("0");
                continue;
            }
        }
        return answer.toString();
    }

    private static int convertToDecimal(String binary) {
        int num = NUM;
        int answer = 0;
        for (String s : binary.split("")) {
            answer += Integer.parseInt(s) * (int) Math.pow(2, num - 1);
            num--;
        }
        return answer;
    }
}
