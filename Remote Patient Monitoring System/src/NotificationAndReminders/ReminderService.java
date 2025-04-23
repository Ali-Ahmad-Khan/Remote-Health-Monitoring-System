package NotificationAndReminders;

import UserManagement.Patient;

public class ReminderService {
    public static void sendReminder(int patientId, String message) {
        Patient patient = Patient.getPatient(patientId);
        if (patient == null) {
            System.out.println("[Reminder] Patient not found.");
            return;
        }

        Notifiable email = new EmailNotification();
        Notifiable sms = new SMSNotification();

        email.send(patient.getEmail(), message);
        sms.send("+923000000000", message); // Placeholder phone number

        patient.notifications.add("[Reminder] " + message);
        System.out.println("Reminder sent to Patient ID: " + patientId);
    }
}
