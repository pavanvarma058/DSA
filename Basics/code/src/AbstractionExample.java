// Abstract class example
abstract class BankAcc{
    double balance;
    abstract void addMoney(double amount);
    abstract void canUserWithdrawMoney(double amount);

    void updateBalance(double _balance){
        balance = _balance;
    }

    public double getBalance(){
        return balance;
    }
}

class SavingsAccount extends BankAcc{
    public void addMoney(double amount){
        super.updateBalance(super.getBalance() + amount);
    }

    public void canUserWithdrawMoney(double amount){
        if(amount <= super.getBalance()){
            System.out.println("User can");
        }else {
            System.out.println("user cannot");
        }
    }
}

class CurrentAccount extends BankAcc {
    double minimumLimit = 1000.0;
    public void addMoney(double amount){
        super.updateBalance(super.getBalance() + amount);
    }

    public void canUserWithdrawMoney(double amount){
        if(super.getBalance() - amount >= minimumLimit){
            System.out.println("User can");
        }else {
            System.out.println("user cannot");
        }
    }
}
public class AbstractionExample {
    public static void main(String[] args) {
        SavingsAccount myAccount = new SavingsAccount();
        myAccount.addMoney(50000.00);
        myAccount.canUserWithdrawMoney(1000.00);
    }
}
