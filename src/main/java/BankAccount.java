public class BankAccount {
    private String name;

    private double balance;

    public BankAccount (String name, double balance) {

        this.balance = balance;
        this.name = name;
    }

    public double deposit(double amount) {

        return balance += amount;
    }

    public double withdraw(double amount) {

        return balance -= amount;
    }

    public void accountDetails() {

        System.out.println(this.name + "'s account balance: " + this.balance);
    }
}
