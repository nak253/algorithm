package cote.inflearn.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Num10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] strArr = str.split(" ");
        String s = strArr[0];
        char t = strArr[1].charAt(0);

        List<Integer> charIndexList = new ArrayList();
        for (int index = 0; index <s.length(); index++) {
            if (s.charAt(index) == t) {
                charIndexList.add(index);
            }
        }

        List<Integer> indexList = new ArrayList();
        for (int i = 0; i < s.length(); i++) {
            int minIndex = s.length();
            for (int j = 0; j < charIndexList.size(); j++) {
                int num = Math.abs(i-charIndexList.get(j));
                if (num < minIndex) {
                    minIndex = num;
                }
            }
            indexList.add(minIndex);
        }
        for (Integer i: indexList
             ) {
            System.out.print(i+" ");
        }
    }
}
