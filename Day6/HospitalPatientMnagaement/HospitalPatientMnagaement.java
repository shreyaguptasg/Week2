package HospitalPatientMnagaement;

public class HospitalPatientMnagaement {
    public static void main(String[] args) {
        Patient patient1= new InPatient("0111IN2323", "alex", 23, "Malaria", "DrJames", 500);
        Patient patient2 = new OutPatient("011IN334", "Ronny", 45, "HealthyVegeies", "DrRoshni", 890);
        InPatient newPatient1 = (InPatient) patient1;
        OutPatient newPatient2 = (OutPatient)patient2;

        patient1.getPatientDetails();
        patient1.calculateBill();
        newPatient1.addRecord();
        newPatient1.viewRecord();

        patient2.calculateBill();
        patient2.getPatientDetails();
        newPatient2.addRecord();
        newPatient2.viewRecord();
    }


}
