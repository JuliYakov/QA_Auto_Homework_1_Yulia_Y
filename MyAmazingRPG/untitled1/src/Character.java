public class Character {
    String name;
    int health;
    int strength;
    int defense;
    static int characterCount = 0;

    public Character(String name, int health, int strength, int defense) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.defense = defense;
        ++characterCount;
    }

    public String getName() {
        return this.name;
    }

    public void attack(Character other) {
        int damage = this.strength - other.defense;
        if (damage > 0) {
            other.takeDamage(damage);
        }

    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    public boolean isAlive() {
        return this.health > 0;
    }

    public void displayStatus() {
        System.out.println("Ім'я: " + this.name);
        System.out.println("Здоров'я: " + this.health);
        System.out.println("Сила: " + this.strength);
        System.out.println("Захист: " + this.defense);
    }

    public static int getCharacterCount() {
        return characterCount;
    }
}

