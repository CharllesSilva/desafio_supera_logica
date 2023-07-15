package exercicio_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLines = scanner.nextInt();
        scanner.nextLine();

        StringBuilder results = new StringBuilder();

        for (int i = 0; i < numberOfLines; i++) {
            String value = scanner.nextLine();
            int halfOfText = value.length() / 2;

            results.append(reverse(value.substring(0, halfOfText)));
            results.append(reverse(value.substring(halfOfText)));
            results.append("\n");
        }

        System.out.print(results.toString());
    }

    public static String reverse(String values) {
        StringBuilder reversed = new StringBuilder();

        for (int i = values.length() - 1; i >= 0; i--) {
            reversed.append(values.charAt(i));
        }

        return reversed.toString();
    }
}