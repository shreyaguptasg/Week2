package HospitalPatientMnagaement;
import java.util.ArrayList;


public class InPatient extends Patient implements MedicalRecord {
    private String diease;
    private String doctorAssigned;
    private static String status = "Admmitted in hospital";
    double cost;

    private static ArrayList<InPatient> record = new ArrayList<>();

    InPatient(String patientId, String name, int age, String diease, String doctorAssigned, double cost) {
       super(patientId,name,age);
        this.diease = diease;
        this.doctorAssigned = doctorAssigned;
        this.cost = cost;
    }
    public String getDiease(){
        return diease;
    }
    public String getDoctorAssigned(){
        return doctorAssigned;
    }
    public String getStatus(){
        return status;
    }

    @Override
    public void addRecord() {
        record.add(this);

    }

    @Override
    public void viewRecord() {
        for(InPatient records : record){
            System.out.println(records);
        }

    }

    @Override
    public double calculateBill() {
        double roomCharges = 5000;
        double treatmentCharges = 10000;
        return cost + roomCharges + treatmentCharges;
    }

    @Override
    public void getPatientDetails(){
        super.getPatientDetails();
        System.out.println("Diease :" +this.getDiease());
        System.out.println("Doctor Assigned : " +this.getDoctorAssigned());
        System.out.println("Status :" + getStatus());
    }
}
