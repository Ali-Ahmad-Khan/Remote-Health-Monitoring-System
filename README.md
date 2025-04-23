# Remote Patient Monitoring System – README

## Overview  
This Java-based console application simulates a Remote Patient Monitoring System. It includes features such as appointment scheduling, vitals monitoring, emergency alerts, doctor-patient communication, and reminder notifications.

The system is modular, scalable, and fully interactive via terminal menus. All users — patients, doctors, and administrators — have customized flows.

---

## Modules Implemented

### 1. User Management
- Classes: `User`, `Patient`, `Doctor`, `Administrator`
- Role-based login system
- Unique actions for each user type

### 2. Vitals Handling
- Classes: `VitalSign`, `VitalsDatabase`
- Patients can upload heart rate, oxygen level, blood pressure, temperature
- Doctors can view patients' vitals in real time

### 3. Appointment Scheduling
- Classes: `Appointment`, `AppointmentManager`
- Patients book appointments with doctors
- Doctors can approve or reject

### 4. Doctor-Patient Interaction
- Classes: `Feedback`, `Prescription`, `MedicalHistory`
- Doctors prescribe medicines and schedules
- System tracks historical consultations

### 5. Emergency Alert System
- Classes: `PanicButton`, `EmergencyAlert`, `NotificationService`
- Patient can press a panic button
- Sends real-time emergency vitals to a selected doctor
- Alerts delivered via simulated Email and SMS

### 6. Notification & Reminder System
- Interface: `Notifiable`
- Classes: `EmailNotification`, `SMSNotification`, `ReminderService`
- Admin can send reminders to patients
- Emergency alerts and reminders stored as notifications

### 7. Chat & Video Consultation
- Classes: `ChatClient`, `ChatServer`, `VideoCall`
- Two-way doctor-patient messaging
- Video call link (Google Meet style) is generated during call
- All chats and messages are stored

---

## How to Use the System

1. Run `Main.java`
2. Login as:
   - **Patient** → Enter patient ID
   - **Doctor** → Enter doctor ID
   - **Admin** → Enter admin ID
3. Follow on-screen menus based on your role:
   - **Patients**: Book appointments, upload/view vitals, access smart services (messaging, alerts, video call)
   - **Doctors**: Approve appointments, prescribe, view messages and notifications
   - **Admins**: Add or remove patients and doctors, send reminders

---

## Notes

- All data is stored in memory during runtime (no database or file storage).
- Google Meet links are simulated (`https://meet.google.com/abc-defg-hij`) but follow real formatting.
- Messages are stored per sender and can be viewed or replied to through Smart Services.
- The Panic Button and reminder alerts are fully integrated into the patient and admin workflows.
