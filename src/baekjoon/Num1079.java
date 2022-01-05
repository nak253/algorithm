import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num1079 {
    enum ValueOfResistance {black, brown, red, orange, yellow, green, blue, violet, grey, white}
    enum LastResistance {
        black(1), brown(10), red(100), orange(1000),
        yellow(10000), green(100000), blue(1000000), violet(10000000),
        grey(100000000), white(1000000000);
        LastResistance(long value){ this.value = value; }
        private final long value;
        public long getValue() {return value ;}
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] stArr = new String[3];
        stArr[0] = br.readLine();
        stArr[1] = br.readLine();
        stArr[2] = br.readLine();

        ValueOfResistance firstColor = ValueOfResistance.valueOf(stArr[0]);
        ValueOfResistance secondColor = ValueOfResistance.valueOf(stArr[1]);
        LastResistance thirdColor = LastResistance.valueOf(stArr[2]);

        String strNum = String.valueOf(firstColor.ordinal())+String.valueOf(secondColor.ordinal());
        System.out.println(Integer.parseInt(strNum)*thirdColor.getValue());
    }
}
