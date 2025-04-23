package UserManagement;

import AppointmentScheduling.Appointment;
import AppointmentScheduling.AppointmentManager;
import ChatAndVideoConsultation.ChatClient;
import ChatAndVideoConsultation.VideoCall;
import Doctor_PatientInteraction.Feedback;
import Doctor_PatientInteraction.MedicalHistory;
import Doctor_PatientInteraction.Prescription;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Doctor extends User {
    private String specialization;
    public static HashMap<Integer, Doctor> doctors = new HashMap<>();
    public HashMap<Integer, Appointment> appointments = new HashMap<>();
    public HashSet<String> notifications = new HashSet<>();
    public HashMap<Integer, String> messages = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    public Doctor(int userID, String name, int age, String gender, String specialization, String address, String email) {
        super(userID, name, age, gender, address, email);
        this.specialization = specialization;
        doctors.put(userID, this);
    }

    public static Doctor getDoctor(int userID) {
        return doctors.get(userID);
    }

    public void loginDoctor() {
        while (true) {
            System.out.println("\n--- Doctor Dashboard ---");
            System.out.println("1. View Patients");
            System.out.println("2. Approve Appointments");
            System.out.println("3. Prescribe Medicines");
            System.out.println("4. Smart Services");
            System.out.println("0. Logout");
            System.out.print("Choose: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 0 -> { return; }
                case 1 -> System.out.println(Patient.patients);
                case 2 -> {
                    System.out.print("Enter Appointment ID: ");
                    int aid = sc.nextInt();
                    AppointmentManager.approveAppointment(aid);
                }
                case 3 -> {
                    System.out.print("Enter Patient ID: ");
                    int pid = sc.nextInt();
                    Patient p = Patient.getPatient(pid);
                    if (p != null) {
                        Feedback f = new Feedback(this.getUserID(), pid);
                        f.collectFeedback();
                        Prescription.prescribe(pid, f.toString());
                        MedicalHistory.addConsultation(this.getUserID(), p);
                    } else {
                        System.out.println("Patient not found.");
                    }
                }
                case 4 -> smartServices();
                default -> System.out.println("Invalid option.");
            }
        }
    }

    private void smartServices() {
        while (true) {
            System.out.println("\n--- Smart Services ---");
            System.out.println("1. View Messages");
            System.out.println("2. Reply to Message");
            System.out.println("3. View Notifications");
            System.out.println("4. Start Video Call");
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
                case 4 -> VideoCall.initiateCall(this.getUserID());
                default -> System.out.println("Invalid input.");
            }
        }
    }

    @Override
    public String toString() {
        return "Doctor: Name=" + this.getName() + ", Age=" + this.getAge() + ", Specialization=" + this.specialization;
    }
}