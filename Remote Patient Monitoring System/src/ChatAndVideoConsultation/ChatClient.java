package ChatAndVideoConsultation;

import UserManagement.Doctor;
import UserManagement.Patient;

import java.util.Scanner;

public class ChatClient {
    static Scanner sc = new Scanner(System.in);

    public static void sendMessage(int senderId) {
        boolean isDoctor = Doctor.getDoctor(senderId) != null;

        System.out.print("Enter message: ");
        sc.nextLine();
        String msg = sc.nextLine();

        if (isDoctor) {
            System.out.print("Enter Patient ID to send to: ");
            int pid = sc.nextInt();
            Patient patient = Patient.getPatient(pid);
            if (patient != null) {
                patient.messages.put(senderId, msg);
                ChatServer.logMessage(senderId, pid, msg);
            } else {
                System.out.println("Patient not found.");
            }
        } else {
            System.out.print("Enter Doctor ID to send to: ");
            int did = sc.nextInt();
            Doctor doctor = Doctor.getDoctor(did);
            if (doctor != null) {
                doctor.messages.put(senderId, msg);
                ChatServer.logMessage(senderId, did, msg);
            } else {
                System.out.println("Doctor not found.");
            }
        }

        System.out.println("Message sent.");
    }
}
