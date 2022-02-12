package cote.inflearn.array;

import java.util.Scanner;

public class Num11 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int num = in.nextInt();
        int[][] intArr = new int[5][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 5; j++) {
                intArr[i][j] = in.nextInt();
            }
        }

        int[][] answer = new int[5][num];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < num-1; j++) {
                for (int k = j+1; k < num; k++) {
                    if (intArr[j][i] == intArr[k][i]) {
                        answer[j][i] = 1;
                        answer[k][i] = 1;
                    }
                }
            }
        }
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < num; i++) {
            int count = 0;
            for (int j = 0; j < 5; j++) {
                if (answer[i][j] == 1) {
                    count += 1;
                }
            }
            if (max < count) {
                max = count;
                maxIndex = i;
            }
        }
        System.out.println(maxIndex+1);
    }
}
