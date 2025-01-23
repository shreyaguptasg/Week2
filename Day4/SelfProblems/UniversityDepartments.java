package SelfProblems;
import java.util.ArrayList;

class University{
    private String universityName;
    ArrayList<Departments> department;
    ArrayList<Faculty> faculty;
    University(String universityName){
        this.universityName = universityName;
        this.department = new ArrayList<>();
        this.faculty = new ArrayList<>();
    }
    public String getUniversityName(){
        return this.universityName;
    }
    public void addDepartment(Departments d){
        department.add(d);
    }
    public void addFaculty(Faculty f){
        faculty.add(f);
    }
    public void displayDetails(){
        System.out.println("University name :" +universityName);
        for(Departments d1: department){
            System.out.println("Department name : " + d1.getDepartmentName());
        }
        for(Faculty f1: faculty){
            System.out.println("Faculty name :" +f1.getName());
            System.out.println("Faculty id :" +f1.getId());

        }
    }

}
class Faculty{
    private String name;
    private String  id;
    Faculty(String name , String id){
        this.name= name;
        this.id = id;
    }
    public String getName(){
        return this.name;
    }
    public String getId(){
        return this.id;
    }
}
class Departments{
    private String departmentName;
    Departments(String departmentName){
        this.departmentName= departmentName;
    }
    public String getDepartmentName(){
        return this.departmentName;
    }
}
public class UniversityDepartments {
    public static void main(String[] args) {
    University university = new University("TIT");
    Departments d1= new Departments("MBA");
    Departments d2= new Departments("AIML");
    Faculty f1 = new Faculty("Monica", "011CS287");
    Faculty f2 = new Faculty("Neha", "011CS298");
    university.addDepartment(d1);
    university.addDepartment(d2);
    university.addFaculty(f1);
    university.addFaculty(f2);
    university.displayDetails();

    }
}
