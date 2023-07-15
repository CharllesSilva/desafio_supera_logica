package exercicio_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLines = scanner.nextInt();

        List<Integer> allNumbers = new ArrayList<>();

        for (int i = 0; i < numberOfLines; i++) {
            int actualNumber = scanner.nextInt();
            allNumbers.add(actualNumber);
        }

        System.out.println("-----------------");

        List<Integer> pairs;
        List<Integer> odds;
        pairs = getPairs(allNumbers);
        odds = getOdds(allNumbers);

        pairs = bubbleSortMethod(pairs, "ASC");
        odds = bubbleSortMethod(odds, "DESC");

        List<Integer> ordered = new ArrayList<>(pairs);
        ordered.addAll(odds);

        for (int value : ordered) {
            System.out.println(value);
        }

        scanner.close();
    }

    public static void makeSwap(List<Integer> arr, int leftValue, int rightValue) {
        int temp = arr.get(leftValue);
        arr.set(leftValue, arr.get(rightValue));
        arr.set(rightValue, temp);
    }

    public static List<Integer> bubbleSortMethod(List<Integer> arr, String ordination) {
        int lengthOfSortedArray = arr.size();

        boolean swapped = true;
        while (swapped) {
            swapped = false;

            if (ordination.equals("ASC")) {
                for (int i = 1; i < lengthOfSortedArray; i++) {
                    if (arr.get(i - 1) > arr.get(i)) {
                        makeSwap(arr, i, i - 1);
                        swapped = true;
                    }
                }
                lengthOfSortedArray--;
            } else {
                for (int i = 1; i < lengthOfSortedArray; i++) {
                    if (arr.get(i - 1) < arr.get(i)) {
                        makeSwap(arr, i, i - 1);
                        swapped = true;
                    }
                }
                lengthOfSortedArray--;
            }
        }

        return arr;
    }

    public static List<Integer> getPairs(List<Integer> arr) {
        List<Integer> pairs = new ArrayList<>();

        for (int value : arr) {
            if (isPar(value)) {
                pairs.add(value);
            }
        }

        return pairs;
    }

    public static List<Integer> getOdds(List<Integer> arr) {
        List<Integer> odds = new ArrayList<>();

        for (int value : arr) {
            if (!isPar(value)) {
                odds.add(value);
            }
        }

        return odds;
    }

    public static boolean isPar(int num) {
        return num % 2 == 0;
    }
}