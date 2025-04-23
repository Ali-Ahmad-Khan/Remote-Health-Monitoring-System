package Doctor_PatientInteraction;

import java.util.ArrayList;
import java.util.Scanner;

public class Feedback {
    private final int doctorId;
    private final int patientId;
    private final ArrayList<String> medicines;
    private final ArrayList<String> schedules;

    static Scanner sc = new Scanner(System.in);

    public Feedback(int doctorId, int patientId) {
        this.doctorId = doctorId;
        this.patientId = patientId;
        this.medicines = new ArrayList<>();
        this.schedules = new ArrayList<>();
    }

    public void collectFeedback() {
        System.out.print("Enter number of medicines to prescribe: ");
        int count = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < count; i++) {
            System.out.print("Medicine " + (i + 1) + ": ");
            medicines.add(sc.nextLine());
        }

        for (String med : medicines) {
            System.out.print("Enter schedule for " + med + ": ");
            schedules.add(sc.nextLine());
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Doctor ID: ").append(doctorId).append("\n");
        result.append("Patient ID: ").append(patientId).append("\n");
        for (int i = 0; i < medicines.size(); i++) {
            result.append("Medicine: ").append(medicines.get(i))
                    .append(" | Schedule: ").append(schedules.get(i)).append("\n");
        }
        return result.toString();
    }
}
