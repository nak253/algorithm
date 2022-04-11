package cote.inflearn.sortingsearching;

import java.util.Arrays;
import java.util.Scanner;

public class Num6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] students = new int[size];
        for (int i = 0; i < size; i++) {
            students[i] = scanner.nextInt();
        }
        for (int number : solution(students)) {
            System.out.print(number + " ");
        }
    }

    private static int[] solution(int[] students) {
        int[] sortedStudents = students.clone();
        Arrays.sort(sortedStudents);
        int[] result = new int[2];
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if (sortedStudents[i] != students[i]) {
                result[count] = i + 1;
                count++;
            }
        }
        return result;
    }
}
