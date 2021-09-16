package BankAccount2;

public class Bank {
    private static Double interestRate = 0.02;
    private static int accountCount = 0;
    private int id;
    private Double balance;


    public  Double getInterestRate(int years) {
        return years *interestRate  *  this.balance ;
    }

    public static void setInterestRate(Double interestRate) {
        Bank.interestRate = interestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Bank() {
        accountCount++;
        this.id = accountCount;
        this.balance = 0.0;
    }
    public void deposit(double amount){
        this.balance += amount;

    }


}
