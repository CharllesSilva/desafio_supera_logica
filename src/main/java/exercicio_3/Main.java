package exercicio_3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stringInput = scanner.nextLine();

        String[] values = stringInput.split(" ");

        String index0 = values[0];
        String index1 = values[1];

        int targetValue = Integer.parseInt(index1);

        String stringNumbers = scanner.nextLine();

        int sizeArray = Integer.parseInt(index0);

        int[] numbers = new int[sizeArray];

        String[] arrayNumbersString = stringNumbers.split(" ");
        for (int i = 0; i < sizeArray; i++) {
            numbers[i] = Integer.parseInt(arrayNumbersString[i]);
        }

        int result = pairsWithDifference(numbers, targetValue);

        System.out.println(result);

    }

    public static int pairsWithDifference(int[] arr, int target) {
        Arrays.sort(arr);
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] - arr[i] == target) {
                    count++;
                }
            }
        }

        return count;
    }
}