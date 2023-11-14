package Week4;

public class Ex72 {
    private double balance;
    private String owner;

    public Ex72(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdrawal(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }

    public double balance() {
        return balance;
    }

    @Override
    public String toString() {
        return owner + "'s account balance: " + balance;
    }

    public static void transfer(Ex72 from, Ex72 to, double howMuch) {
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }

    public static void main(String[] args) {
        // Exercise 72.1
        Ex72 account = new Ex72("Your account", 100.0);
        account.deposit(20.0);
        System.out.println(account);

        // Exercise 72.2
        Ex72 mattAccount = new Ex72("Matt's account", 1000.0);
        Ex72 myAccount = new Ex72("My account", 0.0);
        mattAccount.withdrawal(100.0);
        myAccount.deposit(100.0);
        System.out.println(mattAccount);
        System.out.println(myAccount);

        // Exercise 72.3
        Ex72 accountA = new Ex72("A", 100.0);
        Ex72 accountB = new Ex72("B", 0.0);
        Ex72 accountC = new Ex72("C", 0.0);

        transfer(accountA, accountB, 50.0);
        transfer(accountB, accountC, 25.0);

        System.out.println(accountA);
        System.out.println(accountB);
        System.out.println(accountC);
    }
}
