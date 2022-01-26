package hackerrank;

public class NumberLineJumps {
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        String answer = "NO";
        int num = x1 - x2;
        int num2 = v2 - v1;

        if (num2 == 0) {
            return answer;
        }

        if (num / num2 < 0) {
            return answer;
        }

        if (num % num2 == 0) {
            answer = "YES";
        }
        return answer;
    }
}

