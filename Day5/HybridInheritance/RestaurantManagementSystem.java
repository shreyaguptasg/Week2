package HybridInheritance;
//Define a superclass Person with attributes like name and id.
class Person1{
    protected String name;
    protected int id;
    Person1(String name, int id){
        this.name=name;
        this.id=id;
    }
}
//Create an interface Worker with a method performDuties().
interface Worker{
    public void performDuties();
}
//Define subclasses Chef  that inherit from Person1 each providing a unique implementation of performDuties().
class Chef extends Person1 implements Worker{
    Chef(String name, int id){
        super(name,id);
    }
    public void performDuties(){
        System.out.println("Chef is cooking food");
    }
}
//Define subclasses Waiter that inherit from Person1 and implement the Worker interface, each providing a unique implementation of performDuties().
class Waiter extends Person1 implements Worker{
    Waiter(String name, int id){
        super(name,id);
    }
    public void performDuties(){
        System.out.println("Waiter is serving food");
    }
}
public class RestaurantManagementSystem {
    public static void main(String[] args) {
        //creating objects of subclass
        Chef chef = new Chef("James", 78339);
        Waiter waiter = new Waiter("Boony", 67363);
        //calling out their respective methods
        chef.performDuties();
        waiter.performDuties();
    }
}
