package org.program.Laba5;

import java.awt.image.BandCombineOp;
import java.util.ArrayList;
import java.util.List;
public class Bank {
    private List<BankAccount> Accounts;

    public void CreateAccount(String accountName, double initialDeposit) {
        if (accountName != null) {
            BankAccount newAccount = new BankAccount(accountName, initialDeposit);
        }
        // исключение
    }
    public BankAccount FindAccount(int accountNumber) {
        BankAccount thisAccount = Accounts.get(accountNumber);
        if (thisAccount != null) {
            return thisAccount;
        }
        return null;
        // исключение
    }
    public boolean TransferMoney(int fromAccountNumber, int toAccountNumber, double amount) {
        BankAccount fromAccount = Accounts.get(fromAccountNumber);
        BankAccount toAccount = Accounts.get(toAccountNumber);
        if (fromAccount == null || toAccount == null || amount == 0) {
            return false;
        }
        if (fromAccount.GetBalance() >= amount) {
            fromAccount.Withdraw(amount);
            toAccount.Deposit(amount);
            return true;
        }
        return false;
    }
}
