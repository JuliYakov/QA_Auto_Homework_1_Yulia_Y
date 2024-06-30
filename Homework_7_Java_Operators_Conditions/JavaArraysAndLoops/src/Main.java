// Змагання між роботами
public class Main {
    public static void main(String[] args) {
        int[] weights = {300, 450, 200, 500, 350};

        int maxWeight = weights[0];
        int strongestRobotIndex = 0;

        for (int i = 1; i < weights.length; i++) {
            if (weights[i] > maxWeight) {
                maxWeight = weights[i];
                strongestRobotIndex = i;
            }
        }
        System.out.println("Найсильніший робот: #" + (strongestRobotIndex + 1));
        System.out.println("Вага, яку підняв: " + maxWeight + " кг");

        // Відстеження споживання води
        int[] waterIntake = {3, 1, 4, 2, 0, 5, 2};
        int totalGlasses = 0;
        int i = 0;

        while (i < waterIntake.length) {
            if (waterIntake[i] >= 2) {
                totalGlasses += waterIntake[i];
            }
            i++;
        }

        System.out.println("Кількість випитих склянок води за тиждень: " + totalGlasses);

        // Пошук студента за номером залікової книжки
        int[] studentIDs = {12345, 67890, 54321, 98765, 24680};
        int searchID = 12345;
        boolean found = false;

        for (int id : studentIDs) {
            if (id == searchID) {
                found = true;
                System.out.println("Студент з номером залікової книжки " + searchID + " знайдений.");
                break;
            }
        }

        if (!found) {
            System.out.println("Студент з номером залікової книжки " + searchID + " не знайдений.");
        }
    }
}




