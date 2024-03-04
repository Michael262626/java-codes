package bankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


    class BankAppTest {
        private BankApp myBank;

        @BeforeEach
        void initializer() {
            myBank = new BankApp("Uba bank");
        }


        @Test
        void transferCash() throws InsufficientFundsException, InvalidPinException, InvalidAccountException, InvalidAmountException {
            myBank.registerCustomer("bada", "mathew", "2354");
            myBank.createAccount(123456789, 0);
            assertEquals(1, myBank.getCustomerList());

            myBank.registerCustomer("dare", "toll", "2006");
            myBank.createAccount(123456732, 0);

            myBank.depositCash(123456789, 10000);
            assertEquals(10000, myBank.checkBalance(123456789));

            myBank.transferCash(123456789, 123456732, 9000, "2006");

            assertEquals(1000, myBank.checkBalance(123456789));
            assertEquals(9000, myBank.checkBalance(123456732));
        }

        @Test
        void depositCash() throws InvalidAmountException {
            myBank.createAccount(123456789, 0);
            assertEquals(0, myBank.checkBalance(123456789));

            myBank.depositCash(123456789, 10000);
            assertEquals(10000, myBank.checkBalance(123456789));
        }

        @Test
        void withdrawCash() throws InsufficientFundsException, InvalidPinException, InvalidAccountException, InvalidAmountException {
            myBank.createAccount(123456789, 0);
            assertEquals(0, myBank.checkBalance(123456789));

            myBank.depositCash(123456789, 10000);
            myBank.withdrawCash(123456789, 1000, "2006");
            assertEquals(9000, myBank.checkBalance(123456789));
        }

        @Test
        void checkBalance() throws InvalidPinException {
            myBank.createAccount(123456789, 0);

            assertEquals(0, myBank.checkBalance(123456789));
        }

        @Test
        void registerCustomer() throws InvalidPinException {
            myBank.registerCustomer("banks", "michael", "2006");
            BankAccount account1 = new BankAccount(123456789, "John Doe", 1000, "2006");
            myBank.addAccount(account1);
            assertEquals(1000, myBank.checkBalance(123456789));
        }

        @Test
        void findAccount() throws InvalidAccountException {
            BankAccount account1 = new BankAccount(123456789, "John Doe", 1000, "2006");
            myBank.addAccount(account1);
            assertEquals(account1.getAccountNumber(), myBank.findAccount(123456789).getAccountNumber());
        }

        @Test
        void removeAccount() throws InvalidAccountException, InvalidPinException {
            myBank.registerCustomer("banks", "michael", "2006");
            BankAccount account1 = new BankAccount(1203884654, "Uba", 1000, "2006");
            BankAccount account2 = new BankAccount(123456789, "Uba", 1000, "2005");
            myBank.addAccount(account1);
            myBank.addAccount(account2);
            myBank.findAccount(1203884654);
            myBank.removeAccount(1203884654, "2006");
            assertEquals(1, myBank.getCustomerList());
        }
        @Test
        void testTo_RegisterCustomerWithIncorrectPin() throws InvalidPinException {
            myBank.registerCustomer("banks", "michael", "2006");
            BankAccount account1 = new BankAccount(123456789, "John Doe", 1000, "208645");
            myBank.addAccount(account1);
            assertThrows(InvalidPinException.class, ()-> myBank.validatePin("208645"));
        }
        @Test
        void testToDeposit5k_and_Withdraw2k_balanceIs3k() throws InsufficientFundsException, InvalidPinException, InvalidAccountException, IllegalArgumentException, InvalidAmountException {
            myBank.createAccount(123456789, 0);
            assertEquals(0, myBank.checkBalance(123456789));

            myBank.depositCash(123456789, 5000);
            myBank.withdrawCash(123456789, 2000, "2006");
            assertEquals(3000, myBank.checkBalance(123456789));
        }
        @Test
        void testThatUserCannotDepositNegativeAmount()  {
            myBank.createAccount(123456789, 0);
            assertThrows(InvalidAmountException.class, ()-> myBank.depositCash(123456789, -10000));
        }
        @Test
        void testToDepositPositiveAmountAndNegativeAMount() throws InvalidAmountException {
            myBank.createAccount(123456789, 0);
            assertEquals(0, myBank.checkBalance(123456789));

            myBank.depositCash(123456789, 10000);
            assertThrows(InvalidAmountException.class, ()-> myBank.depositCash(123456789, -10000));
        }
        @Test
        void testToRemoveAccountAndWithIncorrectPin() throws InvalidPinException, InvalidAccountException {
            myBank.registerCustomer("banks", "michael", "2006");
            BankAccount account1 = new BankAccount(1203884654, "Uba", 1000, "2006");
            BankAccount account2 = new BankAccount(123456789, "Uba", 1000, "2005");
            myBank.addAccount(account1);
            myBank.addAccount(account2);
            myBank.findAccount(1203884654);
            myBank.removeAccount(1203884654, "2006");
            assertThrows(InvalidPinException.class, ()-> myBank.removeAccount(1203884654, "2100"));
        }
        @Test
        void testToRemoveAccountNotAddedToTheList() throws InvalidPinException {
            myBank.registerCustomer("banks", "michael", "2006");
            BankAccount account1 = new BankAccount(1203884654, "Uba", 1000, "2006");
            BankAccount account2 = new BankAccount(123456789, "Uba", 1000, "2005");
            myBank.addAccount(account1);
            myBank.addAccount(account2);
            assertThrows(InvalidAccountException.class, ()-> myBank.findAccount(1203521654));
        }
    }


