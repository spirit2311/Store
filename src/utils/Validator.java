package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Validator {

    public static String validateName(Scanner scanner) {
        String str = scanner.nextLine().trim();
        boolean result = str.matches("[а-яёА-ЯЁ]+");
        while (str.isEmpty()) {
            System.out.print("Пусто! Введите имя клиента: ");
            str = scanner.nextLine().trim();
        }
        while (!result) {
            try {
                throw new NameFormatException("Введите имя на русском языке используя только буквы!");
            } catch (NameFormatException nameFormatException) {
                System.out.println(str + "- Недопустимые символы!");
                System.out.println(nameFormatException.getMessage());
                str = scanner.nextLine().trim();
            }
            return str;
        }

        return str;
    }

    public static int validateQuantityInput(Scanner scanner) {

        int quantity;
        String str1 = null;

        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число!%nВведите количество!: ", str);
        }

        quantity = scanner.nextInt();

        while (quantity <= 0) {
            System.out.println("Неверное значение! Введите количество: ");
            while (!scanner.hasNextInt()) {
                try {
                    str1 = scanner.next().trim();
                } catch (InputMismatchException ime) {
                    System.out.printf("\"%s\" - не число!%nВведите количество!: ", str1);
                }
            }
            quantity = scanner.nextInt();
        }
        return quantity;
    }

    public static double validatePriceInput(Scanner scanner) {

        double price;
        String str1 = null;

        while (!scanner.hasNextDouble()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число!%nВведите цену!: ", str);
        }

        price = scanner.nextDouble();

        while (price <= 0) {
            System.out.print("Неверное значение! Введите цену: ");
            while (!scanner.hasNextDouble()) {
                try {
                    str1 = scanner.next().trim();
                } catch (InputMismatchException ime) {
                    System.out.printf("\"%s\" - не число!%nВведите цену!: ", str1);
                }
            }
            price = scanner.nextDouble();
        }
        return price;
    }
}
