package HospitalPatientMnagaement;

import java.util.ArrayList;

public class OutPatient extends Patient implements MedicalRecord {
    private String ailment;
    private String consultingDoctor;
    private double consultationFee;

    private static ArrayList<OutPatient> record = new ArrayList<>();

    OutPatient(String patientId, String name, int age, String ailment, String consultingDoctor, double consultationFee) {
        super(patientId, name, age);
        this.ailment = ailment;
        this.consultingDoctor = consultingDoctor;
        this.consultationFee = consultationFee;
    }

    public String getAilment() {
        return ailment;
    }

    public String getConsultingDoctor() {
        return consultingDoctor;
    }

    @Override
    public void addRecord() {
        record.add(this);

    }

    @Override
    public void viewRecord() {
        for (OutPatient records : record) {
            records.getPatientDetails();
        }
    }

    @Override
    public double calculateBill() {
        double inpatientCharges = 2000;
        return consultationFee + inpatientCharges;
    }

    public void getPatientDetails() {
        super.getPatientDetails();
        System.out.println("Ailment: " + this.getAilment());
        System.out.println("Consulting Doctor: " + this.getConsultingDoctor());
        System.out.println("Consultation Fee: " + consultationFee);
    }
}
