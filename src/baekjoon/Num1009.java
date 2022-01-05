package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num1009 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testNum = Integer.parseInt(br.readLine());

        for (int i = 0; i < testNum; i++) {
            String[] line = br.readLine().split(" ");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);
            int result = 1;

            for (int j = 0; j < b; j++) {
                result *= a;
                result %= 10;
                if (result == 0) {
                    result = 10;
                }
            }
            System.out.println(result);
        }
    }
}
