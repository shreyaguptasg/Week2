public class Person {
    String name;
    String city;
    int adharCard;

    Person(String name, String city, int adharCard){
        this.name = name;
        this.city = city;
        this.adharCard = adharCard;
    }

    Person(Person person){
        this.name = person.name;
        this.city = person.city;
        this.adharCard = person.adharCard;
    }

    void display(){
        System.out.println("The name of the person is " + name);
        System.out.println("The city of the person is " + city);
        System.out.println("The adharcard number  of the person is " + adharCard);
        

    }
    public static void main(String[] args) {
        Person person1 = new Person("shreya", "Satna", 11187);
        person1.display();
        Person person2 = new Person(person1);
        person2.display();
    }
}
