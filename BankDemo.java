abstract class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    abstract double calculateintrest();

}

class Savingac extends BankAccount {
    Savingac(double balance) {
        super(balance);

    }

    @Override

    double calculateintrest() {
        return balance * 0.34;
    }
}

public class BankDemo {

    public static void main(String[] args) {
        BankAccount bac = new Savingac(56784);
        System.out.println("Intrest  ; " + bac.calculateintrest());

    }
}