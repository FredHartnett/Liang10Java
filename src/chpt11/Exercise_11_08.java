package chpt11;

//Exercise 11.8 p.446 (469)
//Class: Transaction and Account

public class Exercise_11_08 {
    public static void main(String[] args) {
        Account acct = new Account("George",1122,1000);
        acct.setAnnualInterestRate(1.5);

        acct.deposit(30);
        acct.deposit(40);
        acct.deposit(50);

        acct.withdraw(5);
        acct.withdraw(4);
        acct.withdraw(2);

        // Print an account summary
        System.out.println("       Account Summary");
        System.out.println("------------------------------------");
        System.out.println("Account holder name: " + acct.getName());
        System.out.println("Interest rate: " + acct.getAnnualInterestRate());
        System.out.printf("Balance: $%.2f\n", acct.getBalance());
        System.out.println("\n     List of transactions");
        System.out.println("------------------------------------");

        for (int i = 0; i < acct.getTransactions().size(); i++) {
            System.out.println("Date: " +
                    (acct.getTransactions()).get(i).getDate());
            System.out.println("Type: " +
                    (acct.getTransactions()).get(i).getType());
            System.out.println("Amount: " +
                    (acct.getTransactions()).get(i).getAmount());
            System.out.println("Balance: " +
                    (acct.getTransactions()).get(i).getBalance());
            System.out.println("Description: " +
                    (acct.getTransactions()).get(i).getDescription());
            System.out.println();
        }
    }
}
