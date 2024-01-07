package org.program.Laba5;

import org.program.Laba5.Exceptions.AccountNotFoundException;
import org.program.Laba5.Exceptions.InsufficientFundsException;
import org.program.Laba5.Exceptions.NegativeAmountException;

import java.awt.image.BandCombineOp;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<BankAccount> Accounts;

    public Bank() {
        Accounts = new ArrayList<>();
    }
    public BankAccount CreateAccount(String accountName, double initialDeposit) {
        try {
            int accountID = Accounts.size();
            if (accountName != null && initialDeposit >= 0) {
                BankAccount newAccount = new BankAccount(accountName, initialDeposit, accountID);
                Accounts.add(newAccount);
                return newAccount;
            }
        } catch (NegativeAmountException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }
/*
    private BankAccount GetAccountByID(int accountNumber) throws AccountNotFoundException {
        if (accountNumber >= 0 && accountNumber < Accounts.size()) {
            return Accounts.get(accountNumber);
        } else {
            throw new AccountNotFoundException("Account not found");
        }
    }
*/
    public BankAccount FindAccount(int accountNumber) throws AccountNotFoundException {
        if (accountNumber >= 0 && accountNumber < Accounts.size()) {
            return Accounts.get(accountNumber);
        } else {
            throw new AccountNotFoundException("Account not found");
        }
    }

    public boolean TransferMoney(int fromAccountNumber, int toAccountNumber, double amount) {
        try {
            BankAccount fromAccount = this.FindAccount(fromAccountNumber);
            BankAccount toAccount = this.FindAccount(toAccountNumber);

            fromAccount.Withdraw(amount);
            toAccount.Deposit(amount);
            return true;

        } catch (AccountNotFoundException | NegativeAmountException | InsufficientFundsException e) {
            System.err.println(e.getMessage());
            return false;
        }
    }
}
