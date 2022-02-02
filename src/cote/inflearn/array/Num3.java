package cote.inflearn.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Num3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        List<Integer> aList = new ArrayList<>();
        List<Integer> bList = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            aList.add(scanner.nextInt());
        }
        for (int i = 0; i < num; i++) {
            bList.add(scanner.nextInt());
        }

        for (int i = 0; i < num; i++) {
            int result = rockScissorsPaper(aList.get(i), bList.get(i));
            if (0 == result) {
                System.out.println("D");
                continue;
            }
            if (0 < result) {
                System.out.println("A");
                continue;
            }
            System.out.println("B");
        }

    }

    private static int rockScissorsPaper(int num, int num2) {
        if (num == num2) {
            return 0;
        }

        if (num == 1 && num2 == 2) return -1;
        if (num == 2 && num2 == 3) return -1;
        if (num == 3 && num2 == 1) return -1;

        return 1;
    }
}
