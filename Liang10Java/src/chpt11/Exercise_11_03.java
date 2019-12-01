package chpt11;

//Exercise 11.3 p.445 (468)
//Class: Account, CheckingAcct and SavingsAcct

/*
(Subclasses of Account) In Programming Exercise 9.7, the Account class was defined to model a bank account. A
n account has the properties account number, balance, annual interest rate, and date created, and methods to
deposit and with- draw funds. Create two subclasses for checking and saving accounts. A checking account has an
overdraft limit, but a savings account cannot be overdrawn.
Draw the UML diagram for the classes and then implement them. Write a test program that creates objects of Account,
SavingsAccount, and CheckingAccount and invokes their toString() methods.
 */





public class Exercise_11_03 {
    public static void main(String[] args) {
        //SavingsAcct(String name, int id, double balance)
        SavingsAcct s = new SavingsAcct("Bilbo Baggins",4567,1500.00);

        CheckingAcct c = new CheckingAcct("Frodo Baggins",9876,2000,-1000);
        //CheckingAcct(String name, int id, double balance, double overdraftLimit)

        //s.deposit(350);
        //c.deposit(500);

        s.withdraw(1501);
        c.withdraw(4000);

        System.out.println(s.toString());
        System.out.println("************************");
        System.out.println( c.toString());
    }


}
