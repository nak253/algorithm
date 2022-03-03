package cote.inflearn.mapset;

import java.util.Scanner;

public class Num1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        String[] strArr = scanner.nextLine().split("");
        int[] intArr = new int[5];
        int maxIndex = 0;

        for (String s:strArr) {
            intArr[(int)(s.charAt(0))-65] += 1;
        }

        int max = 0;
        for (int i = 0; i < intArr.length; i++) {
            if (max < intArr[i]) {
                max = intArr[i];
                maxIndex = i;
            }
        }

        System.out.println((char) (maxIndex+65));
    }
}
