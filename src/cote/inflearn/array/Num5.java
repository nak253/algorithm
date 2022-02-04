package cote.inflearn.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 2; i <= num; i++) {
            if (primeNumber(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean primeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (0 == number % i) {
                return false;
            }
        }
        return true;
    }
}
