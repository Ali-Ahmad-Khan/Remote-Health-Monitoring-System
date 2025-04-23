//package UserManagement;
//
//import java.util.Scanner;
//
public class Main {
//    static Scanner sc = new Scanner(System.in);
//
    public static void main(String[] args) {
//        new Patient(101, "Ali", 22, "Male", "Street A", "ali@mail.com");
//        new Doctor(201, "Ahmed", 45, "Male", "Cardiology", "Block A", "ahmed@hospital.com");
//        new Administrator(300, "Admin", 40, "Other", "Admin Block", "admin@system.com");
//
//        while (true) {
//            System.out.println("\n==== Remote Patient Monitoring System ====");
//            System.out.println("1. Login as Patient");
//            System.out.println("2. Login as Doctor");
//            System.out.println("3. Login as Administrator");
//            System.out.println("0. Exit");
//            System.out.print("Choose option: ");
//            int choice = sc.nextInt();
//
//            if (choice == 0) return;
//
//            System.out.print("Enter your ID: ");
//            int id = sc.nextInt();
//
//            switch (choice) {
//                case 1 -> {
//                    Patient p = Patient.getPatient(id);
//                    if (p != null) p.loginPatient();
//                    else System.out.println("Invalid patient ID.");
//                }
//                case 2 -> {
//                    Doctor d = Doctor.getDoctor(id);
//                    if (d != null) d.loginDoctor();
//                    else System.out.println("Invalid doctor ID.");
//                }
//                case 3 -> {
//                    if (Administrator.getAdmin(id) != null) adminMenu();
//                    else System.out.println("Invalid admin ID.");
//                }
//                default -> System.out.println("Invalid selection.");
//            }
//        }
//    }
//
//    public static void adminMenu() {
//        while (true) {
//            System.out.println("\n--- Admin Menu ---");
//            System.out.println("1. Add Patient");
//            System.out.println("2. Remove Patient");
//            System.out.println("3. Add Doctor");
//            System.out.println("4. Remove Doctor");
//            System.out.println("0. Logout");
//            int ch = sc.nextInt();
//            sc.nextLine();
//            switch (ch) {               //using qucik switch
//                case 0 -> { return; }
//                case 1 -> {
//                    System.out.print("Enter ID, Name, Age, Gender, Address, Email (space-separated): ");
//                    int id = sc.nextInt();
//                    String name = sc.next();
//                    int age = sc.nextInt();
//                    String gender = sc.next();
//                    String address = sc.next();
//                    String email = sc.next();
//                    Administrator.addPatient(id, name, age, gender, address, email);
//                }
//                case 2 -> {
//                    System.out.print("Enter Patient ID to remove: ");
//                    int id = sc.nextInt();
//                    Administrator.removePatient(id);
//                }
//                case 3 -> {
//                    System.out.print("Enter ID, Name, Age, Gender, Spec, Address, Email (space-separated): ");
//                    int id = sc.nextInt();
//                    String name = sc.next();
//                    int age = sc.nextInt();
//                    String gender = sc.next();
//                    String spec = sc.next();
//                    String address = sc.next();
//                    String email = sc.next();
//                    Administrator.addDoctor(id, name, age, gender, spec, address, email);
//                }
//                case 4 -> {
//                    System.out.print("Enter Doctor ID to remove: ");
//                    int id = sc.nextInt();
//                    Administrator.removeDoctor(id);
//                }
//                default -> System.out.println("Invalid option.");
//            }

            System.out.println("Hi");
        }
    }
//}



