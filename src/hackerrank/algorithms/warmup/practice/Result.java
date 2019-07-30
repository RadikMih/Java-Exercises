package hackerrank.algorithms.warmup.practice;

public class Result {

    public static void main(String[] args) {
        String s = "423692";
        String keypad = "923857614";

        System.out.println(entryTime(s, keypad));
    }


    public static int entryTime(String s, String keypad) {
        int[][] matrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = Integer.parseInt(keypad.charAt((i * 3 + j)) + "");
            }
        }

        int[] current = {0, 0};

        for (int m = 0; m < s.length(); m++) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (matrix[i][j] == Integer.parseInt(s.charAt(m) + "")) {
                        current[0] = i;
                        current[1] = j;
                    }

                }
            }


        }
        return Math.abs(0 - 1) + Math.abs(0 - 1);
    }
}