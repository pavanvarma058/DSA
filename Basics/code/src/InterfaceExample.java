// Interface Example
// We can implement multiple interfaces in a class
interface Animal{
    void bark();

    default void sleep(){
        System.out.println("Sleeping....");
    }
}

interface Pet {
    void ownerName();
}

class Dog implements Animal, Pet {
    public void bark(){
        System.out.println("Bow Bow...");
    }
    public void ownerName(){
        System.out.println("Oliver");
    }
    public void sleep(){
        System.out.println("Dog is sleeping..");
    }
}

class Cat implements Animal {
    public void bark(){
        System.out.println("Meowwwww...");
    }

}

public class InterfaceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.sleep();
        dog.ownerName();
        Cat cat = new Cat();
        cat.bark();
        cat.sleep();
    }
}
