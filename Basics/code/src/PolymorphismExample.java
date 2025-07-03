// Polymorphism Example
class Transport {
    String numberOfVehicle;
    public Transport(String numberOfVehicle){
        this.numberOfVehicle = numberOfVehicle;
    }

    public void honk(){
        System.out.println("Honk!!!!!!!!!!!!!!!!");
    }

    public void printNumberOfVehicle(){
        System.out.println(numberOfVehicle);
    }
}

class Bike extends Transport {
    public Bike(String numberOfBike){
        super(numberOfBike);
    }
    @Override
    public void honk(){
        System.out.println("Give me the way!!!!!!!");
    }
}

class Auto extends Transport{
    public Auto(String numberOfAuto){
        super(numberOfAuto);
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Bike b = new Bike("AP16SW6823");
        b.honk();
        b.printNumberOfVehicle();
        Auto a = new Auto("AP16DJ2040");
        a.honk();
        a.printNumberOfVehicle();
    }
}
