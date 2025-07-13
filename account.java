public class account {
    private double balance;

    public double getbalance() {
        return balance;
    }

    public void setbalance(double balance) {
        if (balance > 0)
            this.balance = balance;
        else
            System.out.println("Balance cannot Negative");

    }

    public static void main(String[] args) {
        account acc = new account();
        acc.setbalance(19374.54);
        System.out.println("Balance is : " + acc.getbalance());

        acc.setbalance(-500);
    }
}