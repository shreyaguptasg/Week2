public class Course {
    String courseName;
    int duration;
    int fees;
    static String instituteName;
    Course(String courseName, int duration, int fees){
        this.courseName = courseName;
        this.duration = duration;
        this.fees = fees;
        instituteName = "ABC Institute";
    }
    void displayCourse(){
        System.out.println("Course name :" +courseName);
        System.out.println("Duration : " +duration);
        System.out.println("Fees : " + fees);
        System.out.println("Institute name :" +instituteName);
    }
    static void updateInstituteNmae(String newName){
        instituteName = newName;
        System.out.println("updated institute name :" + instituteName);
    }
    public static void main(String[] args) {
        Course c1 = new Course("cse", 4, 100000);
        c1.displayCourse();
        Course.updateInstituteNmae("XYZ Institute");

    }
}
