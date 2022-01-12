package leetCode;

public class ReverseInteger {
    public static int reverse(int x) {
        long result = 0;

        while (x != 0) {
            int onesPlace = x % 10;
            x = x / 10;
            result = (result * 10) + onesPlace;
        }

        if (!(Integer.MIN_VALUE <= result && result <= Integer.MAX_VALUE)) {
            return 0;
        }
        int intResult = (int) result;

        return intResult;
    }
}
