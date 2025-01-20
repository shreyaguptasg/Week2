package Level1;

public class Patient {
    static String hospitalName ="XYZ";
    final int patientID;
    String name;
    int age;
    String aliment;
    static int patientCount;

    public Patient(int patientID, String name, int age, String aliment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.aliment = aliment;
        patientCount++;
    }
    static int  getTotalPatients(){
        return patientCount;
    }

    void display(){
        System.out.println("patientId :" +patientID);
        System.out.println("name :" +name);
        System.out.println("age : " +age);
        System.out.println("aliment : " +aliment);
    }

    public static void main(String[] args) {
    Patient patient1 = new Patient(123, "ram", 34,"legbreak");
    int count = Patient.getTotalPatients();
    System.out.println("patientcount :" +count);
    patient1.display();
    if(patient1 instanceof Patient){
        System.out.println("patient1 is an instance of Patient");
    }
else{
        System.out.println("patient1 is not an instance of Patient");
    }
    }
}
