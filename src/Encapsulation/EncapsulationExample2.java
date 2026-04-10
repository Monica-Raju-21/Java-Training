package Encapsulation;

class PatientRecord {
    private int heartRate;

    public void updateHeartRate(int rate) {
        if (rate > 40 && rate < 220) {
            this.heartRate = rate;
            System.out.println("Heart rate updated to: " + heartRate);
        } else {
            System.out.println("Invalid heart rate reading!");
        }
    }
}

public class EncapsulationExample2 {
    public static void main(String[] args) {
        PatientRecord patient = new PatientRecord();
        patient.updateHeartRate(75);
    }
}