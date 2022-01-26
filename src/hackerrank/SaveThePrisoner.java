package hackerrank;

public class SaveThePrisoner {

    public static int saveThePrisoner(int n, int m, int s) {
        int num = (m + (s - 1)) % n;

        if (num == 0) {
            return n;
        }
        return num;
    }
}
