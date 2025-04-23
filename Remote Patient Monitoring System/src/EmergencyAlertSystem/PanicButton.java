// PanicButton.java — Assignment 3: Step 1
package EmergencyAlertSystem;

import HealthDataHandling.VitalsDatabase;
import HealthDataHandling.VitalSign;
import UserManagement.Patient;

public class PanicButton {
    public PanicButton(int patientId) {
        Patient patient = Patient.getPatient(patientId);
        if (patient == null) {
            System.out.println("Patient not found!");
            return;
        }

        VitalSign vitals = VitalsDatabase.vitals.get(patientId);
        if (vitals == null) {
            System.out.println("No vitals found for this patient.");
            return;
        }

        EmergencyAlert alert = new EmergencyAlert(
                patientId,
                vitals.getHeartRate(),
                vitals.getOxygenLevel(),
                vitals.getBloodPressure(),
                vitals.getTemperature()
        );

        alert.notifyDoctor();
    }
}
