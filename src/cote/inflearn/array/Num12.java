package cote.inflearn.array;

import java.util.Scanner;

public class Num12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int testNum = s.nextInt();

        int[] test1 = setArr(s, num);
        int[] test2 = setArr(s, num);
        int[] test3 = setArr(s, num);
        int count = 0;

        for (int i = 0; i < num-1; i++) {
            for (int j = i+1; j < num; j++) {
                int mentorNum = test1[i];
                int menteeNum = test1[j];
                boolean b1 = false;
                boolean b2 = false;
                int mentorIndex = 0;
                int menteeIndex = 0;
                for (int k = 0; k < num; k++) {
                    if (test2[k] == mentorNum) {
                        mentorIndex = k;
                    }
                    if (test2[k] == menteeNum) {
                        menteeIndex = k;
                    }
                }
                if (mentorIndex < menteeIndex) {
                    b1 = true;
                    mentorIndex = 0;
                    menteeIndex = 0;
                }else {
                    continue;
                }

                for (int k = 0; k < num; k++) {
                    if (test3[k] == mentorNum) {
                        mentorIndex = k;
                    }
                    if (test3[k] == menteeNum) {
                        menteeIndex = k;
                    }
                }
                if (mentorIndex < menteeIndex) {
                    b2 = true;
                }else {
                    continue;
                }
                if (b1 && b2) {
                    count++;
                }
            }
        }
        System.out.println(count);

    }

    private static int[] setArr(Scanner s, int num) {
        int[] result = new int[num];
        for (int i = 0; i < num; i++) {
            result[i] = s.nextInt();
        }
        return result;
    }
}
