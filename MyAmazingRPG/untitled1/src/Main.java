public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Character character1 = new Character("Волтер", 100, 20, 5);
        Character character2 = new Character("Дракон", 80, 15, 10);
        character1.displayStatus();
        character2.displayStatus();

        while(character1.isAlive() && character2.isAlive()) {
            character1.attack(character2);
            if (character2.isAlive()) {
                character2.attack(character1);
            }

            character1.displayStatus();
            character2.displayStatus();
        }

        if (character1.isAlive()) {
            System.out.println(character1.getName() + " переміг!");
        } else {
            System.out.println(character2.getName() + " переміг!");
        }

        System.out.println("Загальна кількість створених персонажів: " + Character.getCharacterCount());
    }
}
