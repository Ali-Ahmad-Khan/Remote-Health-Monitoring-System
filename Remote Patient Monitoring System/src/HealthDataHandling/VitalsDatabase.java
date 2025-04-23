package HealthDataHandling;

import java.util.HashMap;
import java.util.Scanner;

public class VitalsDatabase {
    public static HashMap<Integer, VitalSign> vitals = new HashMap<>();

    public static void updateVitals(int id, Scanner sc) {
        VitalSign v = vitals.getOrDefault(id, new VitalSign(id));

        System.out.print("Enter heart rate: ");
        v.setHeartRate(sc.nextDouble());
        System.out.print("Enter oxygen level: ");
        v.setOxygenLevel(sc.nextDouble());
        sc.nextLine(); // consume leftover newline
        System.out.print("Enter blood pressure: ");
        v.setBloodPressure(sc.nextLine());
        System.out.print("Enter temperature: ");
        v.setTemperature(sc.nextDouble());

        vitals.put(id, v);
        System.out.println("Vitals updated.");
    }

    public static String getHeartRate(int id) {
        return vitals.containsKey(id) ? "Heart Rate: " + vitals.get(id).getHeartRate() : "Patient not found.";
    }

    public static String getOxygenLevel(int id) {
        return vitals.containsKey(id) ? "Oxygen Level: " + vitals.get(id).getOxygenLevel() : "Patient not found.";
    }

    public static String getBloodPressure(int id) {
        return vitals.containsKey(id) ? "Blood Pressure: " + vitals.get(id).getBloodPressure() : "Patient not found.";
    }

    public static String getTemperature(int id) {
        return vitals.containsKey(id) ? "Temperature: " + vitals.get(id).getTemperature() : "Patient not found.";
    }

    public static String getAllVitals(int id) {
        return vitals.containsKey(id) ? vitals.get(id).toString() : "No vitals recorded for patient.";
    }
}