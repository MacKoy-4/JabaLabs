package org.program.Laba5;

import org.program.Laba5.Exceptions.*;

public class BankAccount {
    private int AccountNumber = 0;
    private String AccountName;
    private double Balance;

    public BankAccount(String accountName, double initialBalance, int accountID) throws NegativeAmountException {
        if (accountName == null) {
            throw new NegativeAmountException("Invalid name");
        }
        if (initialBalance < 0) {
            throw new NegativeAmountException("Initial balance cannot be negative");
        }
        AccountName = accountName;
        Balance = initialBalance;
        AccountNumber = accountID;
    }
    public void Deposit(double amount) throws NegativeAmountException {
        if (amount < 0) {
            throw new NegativeAmountException("Deposit amount cannot be negative");
        }
        Balance += amount;
    }
    public void Withdraw(double amount) throws NegativeAmountException, InsufficientFundsException {
        if (amount <= 0) {
            throw new NegativeAmountException("Withdrawal amount cannot be negative");
        }
        if (amount > Balance) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal");
        }
        Balance -= amount;
    }
    public double GetBalance() { return Balance; }
    public String GetAccountSummary() {
        return AccountName;
    }
    public int GetAccountID() { return AccountNumber; }

}
