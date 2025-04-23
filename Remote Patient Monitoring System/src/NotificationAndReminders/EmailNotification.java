package NotificationAndReminders;

public class EmailNotification implements Notifiable {
    @Override
    public void send(String recipient, String content) {
        System.out.println("[Email] To: " + recipient);
        System.out.println("Message: " + content);
    }
}
