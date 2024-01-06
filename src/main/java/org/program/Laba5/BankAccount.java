package org.program.Laba5;

public class BankAccount {
    private static int AccountNumber = 0;
    private String AccountName;
    private double Balance;

    public BankAccount(String accountName, double initialBalance) {
        AccountName = accountName;
        Balance = initialBalance;
        AccountNumber = AccountNumber++;
    }
    public void Deposit(double amount) { Balance += amount; }
    public void Withdraw(double amount) { Balance -= amount; }
    public double GetBalance() { return Balance; }
    public String GetAccountSummary() {
        return AccountName;
    }

}
