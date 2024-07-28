public class Main {
    public static void main(String[] args) {
        User olga = new User("Ольга");
        User ivanna = new User("Іванна");
        User natalia = new User("Наталія");

        olga.addContact(ivanna);
        ivanna.addContact(olga);
        ivanna.addContact(natalia);

        olga.sendMessage(ivanna, "Привіт, Іванна!");
        ivanna.sendMessage(natalia, "Привіт, Наталія!");
        natalia.sendMessage(ivanna, "Привіт, Іванна!");

        System.out.println("Повідомлення Іванни:");
        for (Message message : ivanna.getMessages()) {
            System.out.println(message.getText() + " - " + message.getStatus());
        }

        for (Message message : ivanna.getMessages()) {
            ivanna.readMessage(message);
        }

        System.out.println("\nПовідомлення Іванни після читання:");
        for (Message message : ivanna.getMessages()) {
            System.out.println(message.getText() + " - " + message.getStatus());
        }
    }
}

