package cote.inflearn.sortingsearching;

import java.util.Scanner;

public class Num2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int number: solution(numbers)) {
            System.out.print(number + " ");
        }
    }

    private static int[] solution(int[] numbers) {
        int tmp = 0;
        for (int i = 0; i < numbers.length-1; i++) {
            boolean swap = false;
            for (int index2 = 0; index2 < numbers.length-1-i; index2++) {
                if (numbers[index2+1] < numbers[index2]) {
                    tmp = numbers[index2];
                    numbers[index2] = numbers[index2+1];
                    numbers[index2+1] = tmp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
        return numbers;
    }
}
