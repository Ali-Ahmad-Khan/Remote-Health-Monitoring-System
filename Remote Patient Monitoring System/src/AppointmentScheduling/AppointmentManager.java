package AppointmentScheduling;

import java.util.HashMap;

public class AppointmentManager {
    public static HashMap<Integer, Appointment> appointments = new HashMap<>();

    public static void bookAppointment(int patientID, int doctorID) {
        Appointment appointment = new Appointment(patientID, doctorID);
        appointments.put(appointment.getAppointmentID(), appointment);
        System.out.println("Appointment booked with ID: " + appointment.getAppointmentID());
    }

    public static void cancelAppointment(int appointmentID) {
        if (appointments.containsKey(appointmentID)) {
            appointments.remove(appointmentID);
            System.out.println("Appointment " + appointmentID + " cancelled.");
        } else {
            System.out.println("Appointment ID not found.");
        }
    }

    public static void approveAppointment(int appointmentID) {
        if (appointments.containsKey(appointmentID)) {
            appointments.get(appointmentID).setStatus("Approved");
            System.out.println("Appointment " + appointmentID + " approved.");
        } else {
            System.out.println("Appointment ID not found.");
        }
    }

    public static void viewAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments booked.");
        } else {
            for (Appointment appt : appointments.values()) {
                System.out.println(appt);
            }
        }
    }
}