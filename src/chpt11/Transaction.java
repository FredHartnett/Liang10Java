package chpt11;
//Intro to Java Programming 10th ed. Y. Daniel Liang

public class Transaction {
    private java.util.Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;

    public Transaction(char type, double amount, double balance, String description) {
        date = new java.util.Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    public String getDate() {
        return date.toString();
    }

    public char getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getDescription() {
        return description;
    }





}
