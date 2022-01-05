import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num1076 {
    enum ValueOfResistance {black, brown, red, orange, yellow, green, blue, violet, grey, white}

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] stArr = new String[3];
        stArr[0] = br.readLine();
        stArr[1] = br.readLine();
        stArr[2] = br.readLine();

        ValueOfResistance firstColor = ValueOfResistance.valueOf(stArr[0]);
        ValueOfResistance secondColor = ValueOfResistance.valueOf(stArr[1]);
        ValueOfResistance thirdColor = ValueOfResistance.valueOf(stArr[2]);

        String strNum = String.valueOf(firstColor.ordinal())+String.valueOf(secondColor.ordinal());
        System.out.println(Integer.parseInt(strNum)*(long)Math.pow(10,thirdColor.ordinal()));
    }
}
