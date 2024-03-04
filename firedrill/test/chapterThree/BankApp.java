package chapterThree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BankApp {


    private final List<BankAccount> accounts = new ArrayList<>();
    private final List<Customer> customer = new ArrayList<>();

    public BankApp(String name) {

    }


    public BankAccount getAccount(int accountNumber) {
        BankAccount account = accounts.get(accountNumber);
        if (account == null) throw new IllegalArgumentException("Account does not exist");
        return account;
    }

    public void depositCash(int accountNumber, int amount) throws InvalidAmountException {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                account.deposit(amount);
                return;
            }
            throw new InvalidAmountException("invalid amount");
        }
    }

    public int checkBalance(int accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber() == (accountNumber)) return account.getBalance();
        }
        return 0;
    }

    public void createAccount(int accountNumber, int amount) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                throw new IllegalArgumentException("Account already exists");
            }
        }

        accounts.add(new BankAccount(accountNumber, "John Doe", amount, "2006"));
    }

    public void addAccount(BankAccount account1) {
        this.accounts.add(account1);
    }

    public void withdrawCash(int accountNumber, int amount, String fromPin) throws InsufficientFundsException, InvalidPinException, InvalidAccountException {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                account.withdraw(amount, fromPin);
                return;
            }
        }
        throw new InvalidAccountException("Account not found for withdrawal: " + accountNumber);
    }


    public boolean validatePin(String fromPin) throws InvalidPinException {
        if (!(fromPin.length() == 4))
            throw new InvalidPinException("Invalid pin");
        return true;
    }

    public List<BankAccount> registerCustomer(String firstName, String lastName, String fromPin) throws InvalidPinException {
        Customer newCustomer = new Customer(firstName, lastName, fromPin);
        validatePin(fromPin);
        customer.add(newCustomer);
        return accounts;
    }

    public BankAccount findAccount(int accountNumber) throws InvalidAccountException {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        throw new InvalidAccountException("Account does not exist");
    }

    public void removeAccount(int accountNumber, String fromPin) throws InvalidPinException {
        Iterator<BankAccount> accountIterator = accounts.iterator();
        while (accountIterator.hasNext()) {
            BankAccount account = accountIterator.next();
            if (account.getAccountNumber() == accountNumber && account.isCorrectPin(fromPin)) {
                accountIterator.remove();
                return;
            }
            if (validatePin(fromPin)) throw new InvalidPinException("invalid pin");

        }
    }

    public int getCustomerList() {
        return customer.size();
    }

    public void transferCash(int fromAccount, int toAccount, int amount, String pin) throws InvalidAccountException, InvalidPinException, InsufficientFundsException, InvalidAmountException {
        BankAccount sourceAccount = findAccount(fromAccount);
        BankAccount destinationAccount = findAccount(toAccount);

        if (sourceAccount == null || destinationAccount == null) throw new InvalidAccountException("Accounts do not exist");

        if (!sourceAccount.isCorrectPin(pin)) throw new InvalidPinException("Invalid PIN for source account");

        if (amount <= 0) throw new InvalidAmountException("Invalid transfer amount");

        if (sourceAccount.getBalance() < amount) throw new InsufficientFundsException("Insufficient funds in the source account");

        sourceAccount.withdraw(amount, pin);
        destinationAccount.deposit(amount);
    }
}
