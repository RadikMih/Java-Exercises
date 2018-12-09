package telerik.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class CokisProducts {

    private static Map<String, Double> list;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        list = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String input = reader.readLine().trim();
            int divider = input.lastIndexOf(" ");

            String productName = input.substring(0, divider);
            double price = Double.parseDouble(input.substring(divider+1, input.length()));
            list.put(productName, price);
        }

        int m = Integer.parseInt(reader.readLine());
        for (int i = 0; i < m; i++) {
            String[] products = reader.readLine().split(", ");
            solve(products);
        }

    }

    private static void solve(String[] products) {
        double sum = 0;
        int amount;
        String product;

        for (String item : products) {
            item = item.trim();
            if (Character.isDigit(item.charAt(0))) {
                int divider = 0;
                while (Character.isDigit(item.charAt(divider))) {
                    divider++;
                }
                amount = Integer.parseInt(item.substring(0, divider));
                product = item.substring(divider + 1, item.length()).trim();
            } else {
                product = item;
                amount = 1;
            }

            sum += amount * list.get(product);


        }

        System.out.printf("%.2f\n", sum);
    }
}
