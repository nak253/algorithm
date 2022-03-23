package cote.inflearn.sortingsearching;

import java.util.Scanner;

public class Num1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int number : sort(numbers)) {
            System.out.print(number + " ");
        }
    }

    private static int[] sort(int[] numbers) {
        int indexOfLowest = 0;
        int tmp = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            indexOfLowest = i;
            for (int index = i + 1; index < numbers.length; index++){
                if (numbers[index] < numbers[indexOfLowest]) {
                    indexOfLowest = index;
                }
            }
            tmp = numbers[i];
            numbers[i] = numbers[indexOfLowest];
            numbers[indexOfLowest] = tmp;
        }
        return numbers;
    }
}
