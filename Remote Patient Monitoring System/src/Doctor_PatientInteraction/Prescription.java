// Prescription.java
package Doctor_PatientInteraction;

import java.util.HashMap;

public class Prescription {
    public static HashMap<Integer, String> prescriptions = new HashMap<>();

    public static void prescribe(int patientId, String medicineDetails) {
        prescriptions.put(patientId, medicineDetails);
        System.out.println("Prescription saved for Patient ID: " + patientId);
    }

    public static String viewPrescription(int patientId) {
        return prescriptions.containsKey(patientId)
                ? "Prescription: " + prescriptions.get(patientId)
                : "No prescription found for this patient.";
    }
}
