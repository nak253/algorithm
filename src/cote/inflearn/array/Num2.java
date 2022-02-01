package cote.inflearn.array;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Num2 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        List<Integer> integerList = new ArrayList<>();
        int max = 0;

        for (int i = 0; i < size; i++) {
            int num = s.nextInt();
            if (max < num) {
                max = num;
                integerList.add(num);
            }
        }
        System.out.println(integerList.size());
    }
}
