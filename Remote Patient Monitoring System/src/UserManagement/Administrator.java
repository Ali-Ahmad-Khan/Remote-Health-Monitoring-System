// Administrator.java
package UserManagement;

import java.util.HashMap;

public class Administrator extends User {
    public static HashMap<Integer, Administrator> administrators = new HashMap<>();

    public Administrator(int userID, String name, int age, String gender, String address, String email) {
        super(userID, name, age, gender, address, email);
        administrators.put(userID, this);
    }

    public static Administrator getAdmin(int id) {
        return administrators.get(id);
    }

    public static void addPatient(int id, String name, int age, String gender, String address, String email) {
        new Patient(id, name, age, gender, address, email);
        System.out.println("Patient added.");
    }

    public static void removePatient(int id) {
        if (Patient.patients.containsKey(id)) {
            Patient.patients.remove(id);
            System.out.println("Patient removed.");
        } else {
            System.out.println("Patient ID not found.");
        }
    }

    public static void addDoctor(int id, String name, int age, String gender, String specialization, String address, String email) {
        new Doctor(id, name, age, gender, specialization, address, email);
        System.out.println("Doctor added.");
    }

    public static void removeDoctor(int id) {
        if (Doctor.doctors.containsKey(id)) {
            Doctor.doctors.remove(id);
            System.out.println("Doctor removed.");
        } else {
            System.out.println("Doctor ID not found.");
        }
    }

    @Override
    public String toString() {
        return "[Admin] " + super.toString();
    }
}