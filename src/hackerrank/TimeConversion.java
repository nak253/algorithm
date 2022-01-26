package hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) throws ParseException {
       String hour = s.substring(0,2);
       String other = s.substring(2,s.length()-2);
       String m = s.substring(s.length()-2,s.length());

       StringBuilder answer = new StringBuilder();
       if (m.equals("PM") && !hour.equals("12")) {
           hour = Integer.parseInt(hour) + 12 + "";
       }
        if (m.equals("AM") && hour.equals("12")) {
            hour = "00";
        }
        answer.append(hour);
        answer.append(other);

        System.out.println("answer = " + answer);
        return answer.toString();
    }

}

public class TimeConversion {
    public static void main(String[] args) throws IOException , ParseException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
