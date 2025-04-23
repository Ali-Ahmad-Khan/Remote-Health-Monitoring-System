package EmergencyAlertSystem;

import java.util.Scanner;

public class EmergencyAlert {
    private final int patientId;
    private final double heartRate;
    private final double oxygenLevel;
    private final String bloodPressure;
    private final double temperature;

    public EmergencyAlert(int patientId, double hr, double oxy, String bp, double temp) {
        this.patientId = patientId;
        this.heartRate = hr;
        this.oxygenLevel = oxy;
        this.bloodPressure = bp;
        this.temperature = temp;
    }

    public void notifyDoctor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Doctor ID to alert: ");
        int doctorId = scanner.nextInt();

        String details = "[ALERT] Patient ID: " + patientId +
                " | HR: " + heartRate +
                ", O2: " + oxygenLevel +
                ", BP: " + bloodPressure +
                ", Temp: " + temperature;

        NotificationService.sendToDoctor(doctorId, details);
    }
}
