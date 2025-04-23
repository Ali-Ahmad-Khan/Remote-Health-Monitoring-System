package AppointmentScheduling;

public class Appointment {
    private static int counter = 1;
    private int appointmentID;
    private int patientID;
    private int doctorID;
    private String status;

    public Appointment(int patientID, int doctorID) {
        this.appointmentID = counter++;
        this.patientID = patientID;
        this.doctorID = doctorID;
        this.status = "Pending";
    }

    public int getAppointmentID() {
        return appointmentID;
    }

    public int getPatientID() {
        return patientID;
    }

    public int getDoctorID() {
        return doctorID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "AppointmentID: " + appointmentID + ", PatientID: " + patientID + ", DoctorID: " + doctorID + ", Status: " + status;
    }
}
