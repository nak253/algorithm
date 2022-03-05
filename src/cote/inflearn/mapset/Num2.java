package cote.inflearn.mapset;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Num2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, Integer> data1 = createAnagram(scanner.nextLine());
        Map<Character, Integer> data2 = createAnagram(scanner.nextLine());

        System.out.println(isAnagram(data1,data2));
    }

    private static Map<Character, Integer> createAnagram(String s) {
        Map<Character, Integer> result = new HashMap<>();
        for (Character c : s.toCharArray()) {
            result.put(c, result.getOrDefault(c, 0) + 1);
        }
        return result;
    }

    private static String isAnagram(Map<Character, Integer> data1, Map<Character, Integer> data2) {
        String result = "NO";
        if (data1.size() != data2.size()) return result;

        for (Character c: data1.keySet()) {
            if (!data2.containsKey(c)) return result;
            if (data2.get(c) != data1.get(c)) return result;
        }
        result = "YES";
        return result;
    }
}
