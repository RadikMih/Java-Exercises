package hackerrank.algorithms.warmup;

import java.io.IOException;
import java.util.Scanner;

public class TimeConversion {

    static String timeConversion(String s) {
        String hours = s.substring(0, 2);
        String daytime = s.substring(s.length() - 2, s.length());
        int h = Integer.parseInt(hours);
        String minutes = s.substring(2);
        minutes = minutes.substring(0, minutes.length() - 2);
        String result = "";

        if (daytime.equals("AM")) {
            if (h == 12) {
                result = "00" + minutes;
            } else {
                result = s.substring(0, s.length() - 2);
            }

            return result;

        } else {
            if (h == 12){
                result = h + minutes;
            } else {
                h = h + 12;
                if (h > 23) {
                    h = h % 24;
                }
                if (h < 10) {
                    hours = "0" + h;
                } else {
                    hours = h + "";
                }

                result = hours + minutes;
            }

            return result;
        }
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        String s = "05:05:45PM";

        String result = timeConversion(s);

        System.out.println(result);
    }
}

