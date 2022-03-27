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
        boolean swap = true;
        int tmp = 0;
        while (swap) {
            swap = false;
            for (int i = 0; i < numbers.length-1; i++) {
                if (numbers[i+1] < numbers[i]) {
                    tmp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = tmp;
                    swap = true;
                }
            }
        }
        return numbers;
    }
}
