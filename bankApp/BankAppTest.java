package bankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


    class BankAppTest {
        private BankApp myBank;
        private BankAccount myAccount;
        @BeforeEach
        void initializer() {
            myBank = new BankApp("Uba bank");
        }


        @Test
        void transferCash() throws InsufficientFundsException, InvalidPinException, InvalidAccountException, InvalidAmountException {
            myBank.registerCustomer("banks", "michael", "2006");
            myBank.registerCustomer("banks", "John Doe", "2006");

            int accountNo1 = myBank.generateAccountNumber();
            BankAccount account1 = new BankAccount("banks michael", 0, "2006", accountNo1);
            myBank.addAccount(account1);
            myBank.depositCash(accountNo1, 10000);

            int accountNo2 = myBank.generateAccountNumber();
            BankAccount account2 = new BankAccount("banks John Doe", 1000, "2006", accountNo2);
            myBank.addAccount(account2);

            myBank.transferCash(accountNo1, accountNo2, 9000, "2006");

            assertEquals(1000, myBank.checkBalance(accountNo1, "2006")); // Ensure correct balance in account1
            assertEquals(10000, myBank.checkBalance(accountNo2, "2006"));
        }

        @Test
        void depositCash() throws InvalidAmountException {
            myBank.registerCustomer("banks", "michael", "2006");
            int accountNo1 = myBank.generateAccountNumber();
            BankAccount account1 = new BankAccount( "John Doe", 0, "2006", accountNo1);
            myBank.addAccount(account1);
            assertEquals(0, myBank.checkBalance(accountNo1, "2006"));

            myBank.depositCash(accountNo1, 10000);

            assertEquals(10000, myBank.checkBalance(accountNo1, "2006"));
        }

        @Test
        void withdrawCash() throws InsufficientFundsException, InvalidPinException, InvalidAccountException, InvalidAmountException {
            myBank.registerCustomer("banks", "michael", "2006");
            int accountNo1 = myBank.generateAccountNumber();
            BankAccount account1 = new BankAccount( "John Doe", 0, "2006", accountNo1);
            myBank.addAccount(account1);
            assertEquals(0, myBank.checkBalance(accountNo1, "2006"));

            myBank.depositCash(accountNo1, 10000);
            myBank.withdrawCash(accountNo1, 1000, "2006");
            assertEquals(9000, myBank.checkBalance(accountNo1, "2006"));
        }

        @Test
        void checkBalance() throws InvalidPinException {
            myBank.registerCustomer("banks", "michael", "2006");
            int accountNo1 = myBank.generateAccountNumber();
            BankAccount account1 = new BankAccount( "John Doe", 0, "2006", accountNo1);
            myBank.addAccount(account1);

            assertEquals(0, myBank.checkBalance(accountNo1, "2006"));
        }

        @Test
        void registerCustomer() throws InvalidPinException {
            myBank.registerCustomer("banks", "michael", "2006");
            int accountNo1 = myBank.generateAccountNumber();
            BankAccount account1 = new BankAccount( "John Doe", 0, "2006", accountNo1);
            myBank.addAccount(account1);
            assertEquals(0, myBank.checkBalance(accountNo1, "2006"));
        }

        @Test
        void findAccount() throws InvalidAccountException {
            myBank.registerCustomer("banks", "michael", "2006");
            int accountNo1 = myBank.generateAccountNumber();
            BankAccount account1 = new BankAccount( "banks michael", 0, "2006", accountNo1);
            myBank.addAccount(account1);
            assertEquals(account1.getAccountNumber(), myBank.findAccount(accountNo1).getAccountNumber());
        }

        @Test
        void removeAccount() throws InvalidAccountException, InvalidPinException {
            myBank.registerCustomer("banks", "michael", "2006");

            int accountNo1 = myBank.generateAccountNumber();
            BankAccount account1 = new BankAccount("banks michael", 1000, "2006", accountNo1);
            myBank.addAccount(account1);
            myBank.removeAccount(accountNo1, "2006");

            assertEquals(0, myBank.getCustomerCount());;
        }
        @Test
        void testTo_RegisterCustomerWithIncorrectPin() throws InvalidPinException {
            myBank.registerCustomer("banks", "michael", "2006");
            int accountNo2 = myBank.generateAccountNumber();
            BankAccount account1 = new BankAccount("John Doe", 1000, "20032", accountNo2);
            myBank.addAccount(account1);
            assertThrows(InvalidPinException.class, ()-> myBank.validatePin("208645"));
        }
        @Test
        void testToDeposit5k_and_Withdraw2k_balanceIs3k() throws InsufficientFundsException, InvalidPinException, InvalidAccountException, IllegalArgumentException, InvalidAmountException {
            myBank.registerCustomer("banks", "michael", "2006");
            int accountNo1 = myBank.generateAccountNumber();
            BankAccount account1 = new BankAccount( "John Doe", 0, "2006", accountNo1);
            myBank.addAccount(account1);
            assertEquals(0, myBank.checkBalance(accountNo1, "2006"));

            myBank.depositCash(accountNo1, 5000);
            myBank.withdrawCash(accountNo1, 2000, "2006");
            assertEquals(3000, myBank.checkBalance(accountNo1, "2006"));
        }
        @Test
        void testThatUserCannotDepositNegativeAmount()  {
            myBank.registerCustomer("banks", "michael", "2006");
            int accountNo1 = myBank.generateAccountNumber();
            BankAccount account1 = new BankAccount( "John Doe", 1000, "2006", accountNo1);
            myBank.addAccount(account1);
            assertThrows(InvalidAmountException.class, ()-> myBank.depositCash(accountNo1, -10000));
        }
        @Test
        void testToDepositPositiveAmountAndNegativeAMount() throws InvalidAmountException {
            myBank.registerCustomer("banks", "michael", "2006");
            int accountNo1 = myBank.generateAccountNumber();
            BankAccount account1 = new BankAccount( "John Doe", 0, "2006", accountNo1 );
            myBank.addAccount(account1);
            assertEquals(0, myBank.checkBalance(accountNo1 , "2006"));

            myBank.depositCash(accountNo1 , 10000);
            assertThrows(InvalidAmountException.class, ()-> myBank.depositCash(accountNo1 , -10000));
        }
        @Test
        void testToRemoveAccountAndWithIncorrectPin() throws InvalidPinException {
            myBank.registerCustomer("banks", "michael", "2006");
            int accountNo1 = myBank.generateAccountNumber();
            BankAccount account1 = new BankAccount("John Doe", 1000, "2006", accountNo1);
            myBank.registerCustomer("abbey", "abiodun", "2006");
            int accountNo2 = myBank.generateAccountNumber();
            BankAccount account2 = new BankAccount("abbey abiodun", 1000, "2006", accountNo2);
            myBank.addAccount(account1);
            myBank.addAccount(account2);
            myBank.findAccount(accountNo1);
            assertThrows(InvalidPinException.class, () -> myBank.removeAccount(accountNo1, "21050"));
        }
        @Test
        void testToRemoveAccountNotAddedToTheList() throws InvalidPinException {
            myBank.registerCustomer("banks", "michael", "2006");
            int accountNo1 = myBank.generateAccountNumber();
            BankAccount account1 = new BankAccount("banks michael", 1000, "2006", accountNo1);
            myBank.registerCustomer("John", "michael", "2006");
            int accountNo2 = myBank.generateAccountNumber();
            BankAccount account2 = new BankAccount("John michael", 1000, "2006", accountNo2);
            myBank.addAccount(account1);
            myBank.addAccount(account2);
            assertThrows(InvalidAccountException.class, ()-> myBank.removeAccount(1203521654, "2006"));
        }
    }


