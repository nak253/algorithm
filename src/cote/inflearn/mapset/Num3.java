package cote.inflearn.mapset;

import java.util.*;

public class Num3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int num = scanner.nextInt();
        scanner.nextLine();
        String[] numbers = scanner.nextLine().split(" ");
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < num; i++) {
            map.put(numbers[i], map.getOrDefault(numbers[i], 0) + 1);
        }
        System.out.print(map.size()+" ");

        for (int leftPointer = 0, rightPointer = num; rightPointer < size; leftPointer++, rightPointer++) {
            map.put(numbers[leftPointer], map.get(numbers[leftPointer]) - 1);
            if (map.get(numbers[leftPointer]) == 0) {
                map.remove(numbers[leftPointer]);
            }
            map.put(numbers[rightPointer], map.getOrDefault(numbers[rightPointer], 0) + 1);
            System.out.print(map.size()+" ");
        }

    }
}
