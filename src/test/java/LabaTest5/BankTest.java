package LabaTest5;

import org.junit.jupiter.api.*;

import org.program.Laba5.*;
import org.program.Laba5.Exceptions.AccountNotFoundException;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BankTest {
    static Bank bank = new Bank();
    @Test
    @Order(1)
    void CreateAccount() {
        BankAccount account1 = bank.CreateAccount("A", 1000);
        BankAccount account2 = bank.CreateAccount("B", 2000);

        System.out.println(account1.GetAccountSummary() + " ID: " + account1.GetAccountID());
        System.out.println(account2.GetAccountSummary() + " ID: " + account2.GetAccountID());
    }
    @Test
    @Order(2)
    void FindAccount() throws AccountNotFoundException {
        BankAccount account1 = bank.FindAccount(0);
        BankAccount account2 = bank.FindAccount(1);

        System.out.println(account1.GetAccountSummary());
        System.out.println(account2.GetAccountSummary());
    }
    @Test
    @Order(3)
    void TransferMoney() throws AccountNotFoundException {
        if (bank.TransferMoney(0, 1, 1000)) {
            BankAccount account0 = bank.FindAccount(0);
            BankAccount account1 = bank.FindAccount(1);

            double balance0 = account0.GetBalance();
            double balance1 = account1.GetBalance();

            System.out.println(account0.GetAccountSummary() + " balance: " + balance0);
            System.out.println(account1.GetAccountSummary() + " balance: " + balance1);
        }
    }
}
