package SelfProblems;

import java.util.ArrayList;

class School{
     private String schoolName;
     ArrayList<Student> student;
     School(String schoolName) {
         this.schoolName = schoolName;
         this.student = new ArrayList<>();
     }

     public void addStudent(Student s){
         student.add(s);
     }
     public void removeStudent(Student s){
         student.remove(s);
     }
     public void displayStudent(){
         for(Student students: student){
             System.out.println("Student name :" +students.getname());
             System.out.println("Student id : " +students.getId());
         }
     }
}
class Student{
    private String name;
    private int id;
    ArrayList<Course> course;
    Student(String name, int id){
        this.name = name;
        this.id = id;
        this.course = new ArrayList<>();
    }
    public String getname(){
        return this.name;
    }
    public int getId(){
        return this.id;
    }
    public void addCourse(Course c){
        course.add(c);
    }
    public void display(){
        System.out.println("Students enrolled in following courses: "+this.name);
        for(Course courses: course){
            System.out.println("Student name :" + courses.getCourseName());
        }
    }

}
class Course{
    private String courseName;
    ArrayList<Student> student;
    Course(String courseName){
        this.courseName= courseName;
        this.student = new ArrayList<>();
    }
    public String getCourseName(){
        return this.courseName;
    }

    public void addStudent(Student s){
        student.add(s);
    }
    public void displayStudentDetails(){
        if(student.isEmpty()){
            System.out.println("No students have been enrolled");
        }
        else{
            for(Student students: student) {
                System.out.println("Student " + students.getname() + " is enrolled  in " + getCourseName());
            }
        }


    }

}
public class SchoolStudentCourse {
    public static void main(String[] args) {
        School school1 = new School("CJS");
         Student s1 = new Student("ram" , 12);
         Student s2 = new Student("shyam", 13);
         Course c1= new Course("Btech");
         Course c2 = new Course("Civil");
         school1.addStudent(s1);
         school1.addStudent(s2);
         s1.addCourse(c1);
         s2.addCourse(c2);
         c1.addStudent(s1);
         c2.addStudent(s2);
         school1.displayStudent();
         c1.displayStudentDetails();
         c2.displayStudentDetails();
         s1.display();
         s2.display();
         school1.removeStudent(s2);
         school1.displayStudent();




    }
}
