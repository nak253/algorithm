package cote.inflearn.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] primeArr = new int[num + 1];
        primeArr[0] = 1;
        primeArr[1] = 1;
        int count = 0;
        for (int i = 2; i < primeArr.length; i++) {
            if (primeArr[i] == 0) {
                count++;
                for (int j = i; j < primeArr.length; j += i) {
                    primeArr[j] = 1;
                }
            }
        }
        System.out.println(count);
    }
}
