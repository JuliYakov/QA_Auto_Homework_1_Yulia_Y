import java.util.List;
import java.util.Set;

public interface UserInterface {
    String getName();
    Set<User> getContacts();
    List<Message> getMessages();
    void addContact(User user);
    void sendMessage(User to, String text);
    void receiveMessage(Message message);
    void readMessage(Message message);
}
