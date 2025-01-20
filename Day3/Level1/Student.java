package Level1;

class Student{
    //A static variable universityName shared across all students.
    static String universityName ="TIT";
    String name;
   final int rollNumber;
    String grade;

    Student(String name, int rollNumber, String grade){
        this.name  = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }
     static int studentCount;
     //A static method displayTotalStudents() to show the number of students enrolled.
     static void displayTotalStudents(){
         System.out.println("studentCount : " +studentCount);
         studentCount++;
         System.out.println("studentCount :" +studentCount);
     }
     void display(){
         System.out.println("name :" +name);
         System.out.println("roll number :" +rollNumber);
         System.out.println("grade :" +grade);
     }

    public static void main(String[] args) {
    Student student1 = new Student("shreya", 011176, "a");
    Student.displayTotalStudents();
    student1.display();
    if(student1 instanceof Student){
        System.out.println("student1 is an instance of Student");
    }
    else{
        System.out.println("student1 is not an instance of Student");
    }
    }
}