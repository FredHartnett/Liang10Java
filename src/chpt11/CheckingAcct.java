package chpt11;

public class CheckingAcct extends Account {
    private double overdraftLimit;

    public CheckingAcct() {
        super();
        this.overdraftLimit = -500;
    }

    public CheckingAcct(String name, int id, double balance, double overdraftLimit) {
        super(name,id,balance);
        this.overdraftLimit = overdraftLimit;
    }

   @Override
    public void withdraw(double amount) {
       if (getBalance() - amount > overdraftLimit) {
           setBalance(getBalance() - amount);
       } else {
           System.out.println("Not enough funds on deposit for this withdrawal!!!");
       }
   }

    @Override
    public String toString() {
        return "Checking Account..." + "\n" +
                "Name: " + getName() + "\n" +
                "Acct ID: " + String.valueOf(getId()) + "\n" +
                "Balance: " + String.format("%.2f", getBalance()) + "\n" +
                "Over Draft Limit: " + String.format("%.2f", overdraftLimit);
    }
}
