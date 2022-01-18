package cote.inflearn.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        printResult(solution(str));
        br.close();
    }

    private static void printResult(boolean solution) {
        if (solution){
        System.out.println("YES");
        return ;
        }
        System.out.println("NO");
    }

    private static boolean solution(String str) {
        String reverse = new StringBuffer(str).reverse().toString();
        return str.equalsIgnoreCase(reverse);
    }
}
