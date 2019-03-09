package ones.and.twos;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the onesAndTwos function below.
     */
    static int onesAndTwos(int a, int b) {
        /*
         * Write your code here.
         */


        if (b == 0) {
            return a;
        }

        if (b == 2) {

            return 4 + a;
        }
        int minCount = 0;

        int result = 0;

        List<Integer> values = new ArrayList<>();

        //Getting the list of values
        for (int i = 1; i < b + 1; i++) {
            values.add((int)(Math.pow(2, i + 1) - (Math.pow(2, i) + 2)));
        }

        if (a == 0) {
            result = 2 * b;
            int count = 0;
            int amount = 0;
            for (int i = 0; i < values.size(); i++) {
                int index = values.get(i);
                while (amount <= b / index) {

                }
            }

        }
        return (int)Math.pow(2, b) + a;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] ab = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            int a = Integer.parseInt(ab[0]);

            int b = Integer.parseInt(ab[1]);

            int result = onesAndTwos(a, b);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
