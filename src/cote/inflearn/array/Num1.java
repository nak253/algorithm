package cote.inflearn.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Num1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        List<Integer> integerList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            integerList.add(s.nextInt());
        }

        List<Integer> answer = new ArrayList<>();
        answer.add(integerList.get(0));
        for (int i = 1; i < integerList.size(); i++) {
            if (integerList.get(i-1) < integerList.get(i)) {
                answer.add(integerList.get(i));
            }
        }

        for (int i: answer) {
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
