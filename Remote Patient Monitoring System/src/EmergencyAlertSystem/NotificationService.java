package EmergencyAlertSystem;

import UserManagement.Doctor;

public class NotificationService {
    public static void sendToDoctor(int doctorId, String message) {
        Doctor doctor = Doctor.getDoctor(doctorId);
        if (doctor == null) {
            System.out.println("Doctor not found.");
            return;
        }

        System.out.println("\n[NotificationService] Sending Emergency Notification...");
        System.out.println("Simulating Email: " + doctor.getEmail());
        System.out.println("Simulating SMS: +923000000000");

        doctor.notifications.add(message);

        System.out.println("Notification successfully sent to Doctor ID: " + doctorId);
    }
}
