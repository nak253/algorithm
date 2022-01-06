package cote.inflearn.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String[] strArr = str.split(" ");
        int size = 0;
        int index = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (size < strArr[i].length()) {
                size = strArr[i].length();
                index = i;
            }
        }
        System.out.println(strArr[index]);
    }
}
