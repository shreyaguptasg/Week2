class Circle{
    int radius;
    Circle(){
        this(5);
        System.out.println("Default constructor");
    }
    Circle(int radius){
        this.radius = radius;
        System.out.println(radius);
    }
    public static void main(String [] args){
        Circle circle1 = new Circle();
        System.out.println(circle1);
        Circle circle2 = new Circle(10);
        System.out.println(circle2);
    }
}