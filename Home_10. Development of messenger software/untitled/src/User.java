import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User implements UserInterface {
    private String name;
    private Set<User> contacts;
    private List<Message> messages;

    public User(String name) {
        this.name = name;
        this.contacts = new HashSet<>();
        this.messages = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Set<User> getContacts() {
        return contacts;
    }

    @Override
    public List<Message> getMessages() {
        return messages;
    }

    @Override
    public void addContact(User user) {
        contacts.add(user);
    }

    @Override
    public void sendMessage(User to, String text) {
        Message message = new Message(this, to, text);
        messages.add(message); // Добавляем сообщение в отправителя со статусом SENT
        to.receiveMessage(message);
    }

    @Override
    public void receiveMessage(Message message) {
        messages.add(message);
        message.setStatus(MessageStatus.RECEIVED); // Меняем статус на RECEIVED
    }

    @Override
    public void readMessage(Message message) {
        if (messages.contains(message) && message.getStatus() == MessageStatus.RECEIVED) {
            message.setStatus(MessageStatus.READ); // Меняем статус на READ
        }
    }
}
