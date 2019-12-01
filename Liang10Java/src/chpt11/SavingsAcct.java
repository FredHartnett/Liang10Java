package chpt11;

public class SavingsAcct  extends Account {
    public SavingsAcct() {
        super();
    }

    public SavingsAcct(String name, int id, double balance) {
        super(name,id,balance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount > 0) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Not enough funds on deposit for this withdrawal!!!");
        }
    }

    @Override
    public String toString() {
        return "Savings Account..." + "\n" +
                "Name: " + getName() + "\n" +
                "Acct ID: " + String.valueOf(getId()) + "\n" +
                "Balance: " + String.format("%.2f", getBalance());
    }
}
