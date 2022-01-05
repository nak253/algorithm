package cote.inflearn.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num2 {
    public static String solution(String str){
        char[] cArr = str.toCharArray();
        for (int i = 0; i < cArr.length; i++) {
            if('a'<=cArr[i]&&cArr[i]<='z'){
                cArr[i] = Character.toUpperCase(cArr[i]);
                continue;
            }
            cArr[i] = Character.toLowerCase(cArr[i]);
        }
        return String.valueOf(cArr);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(solution(str));

    }
}
