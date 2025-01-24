package HierarchicalInheritance;
//Create a hierarchy for a school system where Person is the superclass,
// and Teacher, Student, and Staff are subclasses.
//Define a superclass Person with common attributes like name and age.
class Person{
    protected String name;
    protected int age;
    Person(String name, int age){
        this.name= name;
        this.age= age;
    }
    public void displayRole(){
        System.out.println("Name :" +this.name);
        System.out.println("Age :" + this.age);
    }
}
//Define subclasses Teacher with specific attributes subject
class Teacher extends Person{
    protected String subject;
    Teacher(String name, int age , String subject){
       super(name,age);
        this.subject= subject;
    }
    @Override
    public void displayRole(){
        super.displayRole();
        System.out.println("Subject :" + this.subject);
    }
}
//Define subclasses Student with specific attributes grade for Student).
class Student extends Person{
    protected String grade;
    Student(String name, int age , String grade){
        super(name,age);
        this.grade= grade;
    }
    @Override
    public void displayRole(){
        super.displayRole();
        System.out.println("Grade :" + this.grade);
    }
}
//Define a subclass Staff
class Staff extends Person{
    Staff(String name, int age){
        super(name,age);
    }
}
public class SchoolSystemwithDifferentRoles {
    public static void main(String[] args) {
        //creating objects of superclass and subclass
        Person person = new Person("Alex",45);
        Teacher teacher = new Teacher("Jinny", 34, "Maths");
        Student student = new Student("Rohan" , 23, "A");
        Staff staff = new Staff("Rinny", 67);
        //calling out their respective methods
        person.displayRole();
        teacher.displayRole();
        student.displayRole();
        staff.displayRole();
    }
}
