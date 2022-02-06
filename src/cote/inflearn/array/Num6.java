package cote.inflearn.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");
        
        for (String s : strArr) {
            StringBuffer reverse = new StringBuffer(s).reverse();
            int num = Integer.parseInt(reverse.toString());
            if (isPrimeNum(num)) {
                System.out.print(num + " ");
            }
        }

    }

    private static boolean isPrimeNum(int num) {
        if (num == 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
