package HealthDataHandling;

public class VitalSign {
    private int patientID;
    private double heartRate;
    private double oxygenLevel;
    private String bloodPressure;
    private double temperature;

    public VitalSign(int patientID) {
        this.patientID = patientID;
        this.heartRate = 0.0;
        this.oxygenLevel = 0.0;
        this.bloodPressure = "0/0";
        this.temperature = 0.0;
    }

    public int getPatientID() {
        return patientID;
    }

    public double getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(double heartRate) {
        this.heartRate = heartRate;
    }

    public double getOxygenLevel() {
        return oxygenLevel;
    }

    public void setOxygenLevel(double oxygenLevel) {
        this.oxygenLevel = oxygenLevel;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HR: " + heartRate + ", O2: " + oxygenLevel + ", BP: " + bloodPressure + ", Temp: " + temperature;
    }
}
