package hackerrank;

public class SaveThePrisoner {

    public static int saveThePrisoner(int n, int m, int s) {
        if (m == 1) {
            return s;
        }

        int answer = (m%n) + (s-1);
        if ( answer % n == 0) {
            return n;
        }
        return answer%n;
    }
}
