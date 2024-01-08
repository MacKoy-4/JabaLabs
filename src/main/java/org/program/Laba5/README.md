# JabaLabs
Класс BankAccount

Конструктор:

    public BankAccount(String accountName, double initialBalance, int accountID)

    • accountName - имя аккаунта
    • initialBalance - изначальный баланс
    • accountID - айди аккаунта, назначается при создании аккаунта в Bank.CreateAccount()

Пополнить баланс:

    public void Deposit(double amount)
    Метод устойчив к неправильным вводным данным и не будет выполняться, если: 
    amount меньше 0

Снять со счета:

    public void Withdraw(double amount)

    Метод устойчив к неправильным вводным данным и не будет выполняться, если:
    amount меньше либо равен 0, amount больше баланса

Получить баланс аккаунта: 

    public double GetBalance()

Получить имя аккаунта:

    public String GetAccountSummary()

Получить айди аккаунта:

    public int GetAccountID()

Класс Bank

Конструктор:

    public Bank()
    Создает банк с списком хранящим все учетные записи.

Метод для создания нового аккаунта:

    public BankAccount CreateAccount(String accountName, double initialDeposit)

    Создает новый аккаунт, помещает его в список конкретного Bank, выдает уникальный айди.
    Возвращает созданный BankAccount, если данные правильны.
    Вернет null, если имя аккаунта неккоректно или изначальный баланс меньше 0.

Метод для поиска аккаунта по номеру:

    public BankAccount FindAccount(int accountNumber)

    Ищет аккаунт по номеру и возвращает его. Если аккаунт не найден, выбрасывает AccountNotFoundException.

Метод для перевода средств между аккаунтами:

    public boolean TransferMoney(int fromAccountNumber, int toAccountNumber, double amount)

    Переводит средства с одного аккаунта на другой. Возвращает true, если перевод успешен, иначе false.
    Если введены неправильные данные - возвращает AccountNotFoundException, NegativeAmountException, InsufficientFundsException

