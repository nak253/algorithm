package cote.inflearn.sortingsearching;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Num5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(solution(numbers));
    }

   /* private static char solution(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    return 'D';
                }
            }
        }
        return 'U';
    }*/

    //HashMap사용
    private static char solution(int[] numbers) {
        Map<Integer, Integer> result = new HashMap<>();
        for (int number : numbers) {
            result.put(number, result.getOrDefault(number, 0) + 1);
        }

        for (int number : result.keySet()) {
            if (result.get(number) > 1) {
                return 'D';
            }
        }
        return 'U';
    }
}
