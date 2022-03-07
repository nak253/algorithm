package cote.inflearn.mapset;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Num4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] charArr = scanner.nextLine().toCharArray();
        char[] anagram = scanner.nextLine().toCharArray();
        Map<Character, Integer> characterMap = new HashMap<>();
        Map<Character, Integer> anagramMap = new HashMap<>();
        int count = 0;
        int length = anagram.length - 1;

        for (int i = 0; i < anagram.length; i++) {
            anagramMap.put(anagram[i], anagramMap.getOrDefault(anagram[i], 0) + 1);
        }

        for (int i = 0; i < length; i++) {
            characterMap.put(charArr[i], characterMap.getOrDefault(charArr[i], 0) + 1);
        }

        for (int lp = 0, rp = length; rp < charArr.length; rp++) {
            characterMap.put(charArr[rp], characterMap.getOrDefault(charArr[rp], 0) + 1);
            if (characterMap.equals(anagramMap)) {
                count++;
            }
            characterMap.put(charArr[lp], characterMap.get(charArr[lp]) - 1);
            if (characterMap.get(charArr[lp]) == 0) {
                characterMap.remove(charArr[lp]);
            }
            lp++;
        }
        System.out.println(count);
    }
}
