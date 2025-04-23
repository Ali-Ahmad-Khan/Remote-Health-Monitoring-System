package NotificationAndReminders;

public class SMSNotification implements Notifiable {
    @Override
    public void send(String recipient, String content) {
        System.out.println("[SMS] To: " + recipient);
        System.out.println("Message: " + content);
    }
}
