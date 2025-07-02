class BankAccount {
    double balance;

    public BankAccount(double balance){
        this.balance = balance;
    }

    public void printBalance(){
        System.out.println(balance);
    }
}
public class ParameterizedConstructor {
    public static void main(String[] args) {
        // Example of parameterized constructor
        BankAccount b = new BankAccount(1000.00);
        b.printBalance();
    }
}
