package UserManagement;

import AppointmentScheduling.Appointment;
import AppointmentScheduling.AppointmentManager;
import ChatAndVideoConsultation.ChatClient;
import ChatAndVideoConsultation.VideoCall;
import Doctor_PatientInteraction.Prescription;
import EmergencyAlertSystem.PanicButton;
import HealthDataHandling.VitalsDatabase;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Patient extends User {
    public static HashMap<Integer, Patient> patients = new HashMap<>();
    public HashMap<Integer, Appointment> appointments = new HashMap<>();
    public HashSet<String> notifications = new HashSet<>();
    public HashMap<Integer, String> messages = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    public Patient(int userID, String name, int age, String gender, String address, String email) {
        super(userID, name, age, gender, address, email);
        patients.put(userID, this);
    }

    public static Patient getPatient(int userID) {
        return patients.get(userID);
    }

    public void loginPatient() {
        while (true) {
            System.out.println("\n--- Patient Dashboard ---");
            System.out.println("1. Book Appointment");
            System.out.println("2. View Vitals");
            System.out.println("3. Update Vitals");
            System.out.println("4. View Prescription");
            System.out.println("5. Smart Services");
            System.out.println("0. Logout");
            System.out.print("Choose: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 0 -> { return; }
                case 1 -> {
                    System.out.print("Enter Doctor ID to book: ");
                    int docId = sc.nextInt();
                    if (Doctor.getDoctor(docId) != null)
                        AppointmentManager.bookAppointment(this.getUserID(), docId);
                    else
                        System.out.println("Doctor not found.");
                }
                case 2 -> System.out.println(VitalsDatabase.getAllVitals(this.getUserID()));
                case 3 -> VitalsDatabase.updateVitals(this.getUserID(), sc);
                case 4 -> System.out.println(Prescription.viewPrescription(this.getUserID()));
                case 5 -> smartServices();
                default -> System.out.println("Invalid input.");
            }
        }
    }

    private void smartServices() {
        while (true) {
            System.out.println("\n--- Smart Services ---");
            System.out.println("1. View Messages");
            System.out.println("2. Reply to Message");
            System.out.println("3. View Notifications");
            System.out.println("4. Press Panic Button");
            System.out.println("5. Start Video Call");
            System.out.println("0. Back");
            System.out.print("Choose: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 0 -> { return; }
                case 1 -> {
                    if (messages.isEmpty()) System.out.println("No messages.");
                    else messages.forEach((from, msg) -> System.out.println("From ID " + from + ": " + msg));
                }
                case 2 -> ChatClient.sendMessage(this.getUserID());
                case 3 -> {
                    if (notifications.isEmpty()) System.out.println("No notifications.");
                    else notifications.forEach(System.out::println);
                }
                case 4 -> new PanicButton(this.getUserID());
                case 5 -> VideoCall.initiateCall(this.getUserID());
                default -> System.out.println("Invalid input.");
            }
        }
    }

    @Override
    public String toString() {
        return "Patient ID: " + this.getUserID() + ", Name: " + this.getName();
    }
}