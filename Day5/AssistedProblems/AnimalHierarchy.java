package AssistedProblems;
//Define a superclass Animal with attributes name and age, and a method makeSound().
class Animal{
     protected String name;
     protected int age;
     Animal(String name, int age){
         this.name = name;
         this.age = age;
    }
     public void makeSound(){
         System.out.println("Animal makes sound");
     }
}
//Define subclasses Dog each with a unique implementation of makeSound().
class Dog extends Animal{
    Dog(String name, int age){
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog is making sound");
    }
}
//Define subclasses  Cat each with a unique implementation of makeSound().
class Cat extends Animal{
    Cat(String name, int age){
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Cat is making sound");
    }
}
//Define subclasses Bird each with a unique implementation of makeSound().
class Bird extends Animal{
    Bird(String name, int age){
        super(name, age);
    }
    @Override
    public void makeSound(){
        System.out.println("Bird is making sound");
    }

}

public class AnimalHierarchy{
    public static void main(String[] args) {
        //creating objects of superclass and subclass
        Animal animal = new Animal("Elephant", 8);
        Dog dog = new Dog("Bruno", 3);
        Cat cat = new Cat("Nano", 5);
        Animal bird = new Bird("Pihu", 7);
        //calling out their respective methods
        animal.makeSound();
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}