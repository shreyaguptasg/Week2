package HospitalPatientMnagaement;
//Create an abstract class Patient with fields like patientId, name, and age.
//Add an abstract method calculateBill() and a concrete method getPatientDetails().
abstract class Patient {
    private  String patientId;
    private String  name;
    private  int age;

    Patient(String patientId, String name, int age){
        this.patientId = patientId;
        this.name= name;
        this.age= age;
    }
    //creating getter methods for each attribute
    public String getPatientId(){
        return patientId;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    //abstract method
    abstract public double calculateBill();
    //concrete methods
    public void getPatientDetails(){
        System.out.println("PatientId : " +this.getPatientId());
        System.out.println("Name : " + this.getName());
        System.out.println("Age : " + this.getAge());
    }


}
