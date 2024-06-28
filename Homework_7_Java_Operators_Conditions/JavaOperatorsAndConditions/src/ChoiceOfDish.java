import java.util.Scanner;

public class ChoiceOfDish {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Оберіть тип страви (1 - закуска, 2 - основна страва, 3 - десерт, 4 - напій): ");
        int dishType = scanner.nextInt(); // считывание типа блюда

        String dish;

        switch (dishType) {
            case 1:
                dish = "Закуска: Салат \"Цезар\"";
                break;
            case 2:
                dish = "Основна страва: Борщик зі сметаною";
                break;
            case 3:
                dish = "Десерт: Тірамісу";
                break;
            case 4:
                dish = "Напій: Кава";
                break;
            default:
                dish = "Невідомий тип страви";
                break;
        }

        System.out.println("Дякуємо за Ваш вибір: " + dish);
    }
}
