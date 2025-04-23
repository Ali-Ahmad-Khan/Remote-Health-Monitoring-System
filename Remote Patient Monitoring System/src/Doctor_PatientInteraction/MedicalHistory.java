package Doctor_PatientInteraction;

import UserManagement.Patient;

import java.util.HashMap;
import java.util.Map;

public class MedicalHistory {
    public static Map<Integer, Patient> consultationRecords = new HashMap<>();

    public static void addConsultation(int doctorId, Patient patient) {
        consultationRecords.put(doctorId, patient);
        System.out.println("Consultation recorded between Doctor ID: " + doctorId + " and Patient ID: " + patient.getUserID());
    }

    public static void viewHistory(int patientId) {
        boolean found = false;
        for (Map.Entry<Integer, Patient> entry : consultationRecords.entrySet()) {
            if (entry.getValue().getUserID() == patientId) {
                System.out.println("Doctor ID: " + entry.getKey() + " | Patient: " + entry.getValue().getName());
                found = true;
            }
        }
        if (!found) System.out.println("No medical history found for Patient ID: " + patientId);
    }
}
