package cote.inflearn.sortingsearching;

import java.util.Scanner;

public class Num3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int number : solution(numbers)) {
            System.out.print(number + " ");
        }
    }

    private static int[] solution(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; 0 < j; j--) {
                if (numbers[j] < numbers[j-1]) {
                    int tmp = numbers[j-1];
                    numbers[j-1] = numbers[j];
                    numbers[j] = tmp;
                }else {
                    break;
                }
            }
        }
        return numbers;
    }
}
