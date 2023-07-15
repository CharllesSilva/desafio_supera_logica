package exercicio_2;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal money = scanner.nextBigDecimal();

        BigDecimal[] notes = {
                BigDecimal.valueOf(100),
                BigDecimal.valueOf(50),
                BigDecimal.valueOf(20),
                BigDecimal.valueOf(10),
                BigDecimal.valueOf(5),
                BigDecimal.valueOf(2)
        };

        System.out.println("NOTAS:");
        for (BigDecimal note : notes) {
            int quantityOfNotes = money.divide(note, 0, BigDecimal.ROUND_DOWN).intValue();
            System.out.printf("%d nota(s) de R$ %.2f%n", quantityOfNotes, note);
            money = money.subtract(note.multiply(BigDecimal.valueOf(quantityOfNotes)));
        }

        BigDecimal[] coins = {
                BigDecimal.valueOf(1),
                BigDecimal.valueOf(0.5),
                BigDecimal.valueOf(0.25),
                BigDecimal.valueOf(0.10),
                BigDecimal.valueOf(0.05),
                BigDecimal.valueOf(0.01)
        };

        System.out.println("MOEDAS:");
        for (BigDecimal coin : coins) {
            int quantityOfCoins = money.divide(coin, 0, BigDecimal.ROUND_DOWN).intValue();
            System.out.printf("%d moeda(s) de R$ %.2f%n", quantityOfCoins, coin);
            money = money.subtract(coin.multiply(BigDecimal.valueOf(quantityOfCoins)));
        }
    }
}