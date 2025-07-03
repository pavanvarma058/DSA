// Inheritance Example
class Vehicle {
    String numberOfVehicle;
    public Vehicle(String numberOfVehicle){
        this.numberOfVehicle = numberOfVehicle;
    }

    public void honk(){
        System.out.println("Honk!!!!!!!!!!!!!!!!");
    }

    public void printNumberOfVehicle(){
        System.out.println(numberOfVehicle);
    }
}

class Car extends Vehicle {
    public Car(String numberOfCar){
        super(numberOfCar);
    }
}

class Bus extends Vehicle{
    public Bus(String numberOfBus){
        super(numberOfBus);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Car c = new Car("AP39JW6823");
        Bus b = new Bus("AP39JK9760");
        c.printNumberOfVehicle();
        c.honk();
        b.printNumberOfVehicle();
        b.honk();

    }
}
