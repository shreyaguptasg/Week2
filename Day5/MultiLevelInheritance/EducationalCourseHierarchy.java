package MultiLevelInheritance;
//Model a course system where Course is the base class, OnlineCourse is a subclass, and PaidOnlineCourse extends OnlineCourse.
//Define a superclass Course with attributes like courseName and duration.
class Course{
    protected String courseName;
    protected int year;
    Course(String courseName, int year){
        this.courseName= courseName;
        this.year= year;
    }
    public void displayCourse(){
        System.out.println("CourseName :" +this.courseName);
        System.out.println("Year :" +this.year);
    }
}
//Define OnlineCourse to add attributes such as platform and isRecorded.
class OnlineCourse extends Course{
    protected String platform;
    protected boolean isRecorded;
    OnlineCourse(String courseName, int year, String platform, boolean isRecorded){
        super(courseName,year);
        this.platform= platform;
        this.isRecorded= isRecorded;
    }
    @Override
    public void displayCourse(){
        super.displayCourse();
        System.out.println("Platform :" +this.platform);
        System.out.println("Recorded :" +this.isRecorded);
    }
}
//Define PaidOnlineCourse to add fee and discount.
class PaidOnlineCourse extends OnlineCourse{
    protected int fee;
    protected double discount;
    PaidOnlineCourse(String courseName, int year, String platform, boolean isRecorded, int fee , double discount){
        super(courseName,year,platform,isRecorded);
        this.fee= fee;
        this.discount= discount;
    }
    @Override
    public void displayCourse(){
        super.displayCourse();
        System.out.println("Fee :" +this.fee);
        System.out.println("Discount:" +this.discount);
    }
}
public class EducationalCourseHierarchy {
    public static void main(String[] args) {
        //creating objects of superclass and subclass
        Course course= new Course("BTech",4);
        OnlineCourse onlineCourse = new OnlineCourse("MTech",2,"Online", true);
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("MBA",2,"Offline", false, 80000, 0.05);
        //calling their respective methods
        course.displayCourse();
        onlineCourse.displayCourse();
        paidOnlineCourse.displayCourse();

    }
}
