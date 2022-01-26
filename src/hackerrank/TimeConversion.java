package hackerrank;

public class TimeConversion {

    public static String timeConversion(String s) {
        String hour = s.substring(0, 2);
        String other = s.substring(2, s.length() - 2);
        String m = s.substring(s.length() - 2, s.length());

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
