package SelfProblems;

import java.util.ArrayList;

class Student1{
    private String studentName;
    private String studentId;
    ArrayList<Professor> professor;
    ArrayList<Course1> course;
    Student1(String studentName, String studentId){
        this.studentName= studentName;
        this.studentId= studentId;
        this.professor = new ArrayList<>();
        this.course = new ArrayList<>();
    }
    public String getStudentName(){
        return this.studentName;
    }
    public String getStudentId(){
        return this.studentId;
    }
    public void enrollCourse(Course1 courses){
        course.add(courses);
    }
    public void assignProfessor(Professor professors){
        professor.add(professors);
    }
    public void displayCourseAndProfessorDetails(){
        System.out.println("Students are :");
        System.out.println("Student name : " +this.studentName);
        System.out.println("Student id : " +this.studentId);
        for(Course1 courses: course){
            System.out.println("Course name : " + courses.getCourseName());
            System.out.println("Course id : " + courses.getCourseId());
        }
        for(Professor professors: professor){
            System.out.println("Professor name : " +professors.getProfessorName());
            System.out.println("Professor id : " +professors.getProfessorId());
        }
    }


}
class Professor{
    private String professorName;
    private String professorId;
    Professor(String professorName, String professorId){
        this.professorName= professorName;
        this.professorId= professorId;
    }
    public String getProfessorName(){
        return this.professorName;
    }
    public String getProfessorId(){
        return this.professorId;
    }

}
class Course1{
    private String courseName;
    private String courseId;
    Course1(String courseName, String courseId){
        this.courseName= courseName;
        this.courseId= courseId;
    }
    public String getCourseName(){
        return this.courseName;
    }
    public String getCourseId(){
        return this.courseId;
    }


}
public class UniversityManagement {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jenny" , "12CS436");
        Professor professor2 = new Professor("Zakir" , "12CS478");
        Course1 course1 = new Course1("BTech", "0111");
        Course1 course2 = new Course1("MTech", "0666");
        Student1 student1 = new Student1("Alex" , "0111CS211176");
        Student1 student2 = new Student1("Robin" , "0111CS211190");
        student1.assignProfessor(professor2);
        student1.assignProfessor(professor1);
        student2.assignProfessor(professor1);
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course2);
        student1.displayCourseAndProfessorDetails();
        student2.displayCourseAndProfessorDetails();
    }
}
