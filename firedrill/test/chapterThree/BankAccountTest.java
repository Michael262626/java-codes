package chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    private BankAccount myAccount;

    @BeforeEach
    void initializer(){

        myAccount = new BankAccount(123456789, "John Doe", 0, "2006");
    }

    @Test
    void withdraw() throws InsufficientFundsException, InvalidPinException, InvalidAmountException {
        myAccount.deposit(1000);
        myAccount.setPin("mike");
        myAccount.withdraw(500, "mike");
        assertEquals(500, myAccount.getBalance());
    }

    @Test
    void deposit() throws InvalidAmountException {
      myAccount.deposit(5000);
      assertEquals(5000, myAccount.getBalance());
    }

    @Test
    void checkBalance() throws InvalidAmountException {
        myAccount.deposit(10000);
        assertEquals(10000, myAccount.checkBalance());
    }
    @Test
    void checkIfBalanceIsEmpty() throws InvalidAmountException {
       myAccount.deposit(5000);
       assertFalse(myAccount.isEmpty());
    }

    @Test
    void validatePin() throws InvalidPinException {
        assertThrows(InvalidPinException.class, ()-> myAccount.validatePin("sbeifyeh"));
    }

}