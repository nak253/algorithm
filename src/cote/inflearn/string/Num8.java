package cote.inflearn.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num8 {

    public static boolean solution(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isAlphabetic(c)) {
                sb.append(c);
            }
        }
        str = sb.toString();
        String reverse =sb.reverse().toString();

        return str.equalsIgnoreCase(reverse);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        if (solution(str)) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
