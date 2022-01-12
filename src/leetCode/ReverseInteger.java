package leetCode;

import java.util.Arrays;

public class ReverseInteger {
    public static int reverse(int x) {

        String numStr = String.valueOf(x);
        boolean isMinus = false;

        if (numStr.contains("-")) {
            isMinus = true;
            numStr = numStr.substring(1);
        }
        char[] numCharArr = numStr.toCharArray();
        int lastIndex = numCharArr.length - 1;
        for (int i = 0; i < numCharArr.length / 2; i++) {
            char tmp = numCharArr[i];
            numCharArr[i] = numCharArr[lastIndex];
            numCharArr[lastIndex] = tmp;
            lastIndex--;

        }

        long l = Long.parseLong(String.valueOf(numCharArr));
        if (!(Math.pow(-2, 31) <= l && l <= Math.pow(2, 31) - 1)) {
            return 0;
        }
        int result = (int) l;
        if (isMinus) {
            return result * -1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverse(321));
        System.out.println(reverse(-123));
        System.out.println(reverse(120));
        System.out.println(reverse(10));
        System.out.println(reverse(1534236469));
    }
}
