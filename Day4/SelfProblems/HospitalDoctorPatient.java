package SelfProblems;

import java.util.ArrayList;

class Hospital{
    private String name;
    ArrayList<Doctor> doctor;
    ArrayList<Patient> patient;
    Hospital(String name){
        this.name = name;
        this.doctor = new ArrayList<>();
        this.patient = new ArrayList<>();
    }
    public String getName(){
        return this.name;
    }
    public void addDoctor(Doctor d){
        doctor.add(d);
    }
    public void addPatient(Patient p){
        patient.add(p);
    }
}
class Doctor{
    private String doctorName;
    ArrayList<Patient> patients;
    Doctor(String doctorName){
        this.doctorName = doctorName;
        this.patients = new ArrayList<>();
    }
    public String getDoctorName(){
        return this.doctorName;
    }
    public void addPatient(Patient p){
        patients.add(p);
    }
    public void consult(Patient patient) {
        if (patients.contains(patient)) {
            System.out.println("Dr." + this.doctorName + " is consulting to patient name " + patient.getName() + " having diease " + patient.getDiease());
        } else {
            System.out.println("No appointment schedule with the patient");
        }
    }
}
class Patient{
    private String name;
    private String diease;
    ArrayList<Doctor> doctor;
    Patient(String name, String diease){
        this.name = name;
        this.diease = diease;
        this.doctor = new ArrayList<>();
    }
    public String getName(){
        return this.name;
    }
    public String getDiease(){
        return this.diease;
    }

    public void addDoctor(Doctor d){
        doctor.add(d);
    }
    public void displayDoctor(){
        for(Doctor d1 : doctor){
            System.out.println("Doctor name :" +d1.getDoctorName());

        }
    }
}
public class HospitalDoctorPatient {
    public static void main(String[] args) {
    Hospital hospital = new Hospital("XYZ");
    Doctor DrJanes = new Doctor("janes");
    Doctor DrAlice = new Doctor("Alice");
    Patient patientBob = new Patient("Bob", "Malaria");
    Patient patientAlex = new Patient("Alex" , "HIV");
    hospital.addDoctor(DrAlice);
    hospital.addDoctor(DrJanes);
    hospital.addPatient(patientAlex);
    hospital.addPatient(patientBob);
    DrJanes.addPatient(patientAlex);
    DrAlice.addPatient(patientBob);
    DrJanes.consult(patientAlex);
    DrAlice.consult(patientBob);
    }
}
