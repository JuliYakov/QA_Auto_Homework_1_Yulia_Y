import java.util.Scanner;

public class CoffeShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть кількість еспресо: ");
        int espresso = scanner.nextInt();
        System.out.println("Введіть кількість лате: ");
        int latte = scanner.nextInt();
        System.out.println("Введіть кількість капучіно: ");
        int cappuccino = scanner.nextInt();

        int espressoCost = 3;
        int latteCost = 4;
        int cappuccinoCost = 5;

        int totalСostOrder = (espressoCost * espresso) + (latteCost * latte) + (cappuccinoCost * cappuccino);
        System.out.println("Загальна вартість замовлення: $"+totalСostOrder);

    }
}