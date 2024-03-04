package bankApp;

    public class BankAccount {

        private String name;
        private int balance;
        private String pin;
        private  int number;
        private boolean isEmpty;

        public BankAccount(int accountNumber, String name, int amount, String pin) {
            this.number = accountNumber;
            this.balance = amount;
            this.name = name;
            this.pin = pin;
        }


        public void withdraw(int amount, String enterPin) throws InsufficientFundsException, InvalidPinException {
            if (!enterPin.equals(pin)) {
                throw new InvalidPinException("Invalid PIN for account number: " + getAccountNumber());
            }
            if (amount <= 0) {
                throw new IllegalArgumentException("Invalid withdrawal amount for account number: " + getAccountNumber());
            }
            if (amount > balance) {
                throw new InsufficientFundsException("Insufficient funds for account number: " + getAccountNumber());
            }
            this.balance -= amount;
        }
        public boolean isCorrectPin(String pin){
            return this.pin.equals(pin);
        }
        public void deposit(int amount) throws InvalidAmountException {
            if(amount <= 0) throw new InvalidAmountException("invalid amount");
            this.balance += amount;
        }

        public int checkBalance() {
            return balance;
        }


        public int getBalance() {
            return balance;
        }

        public boolean isEmpty() {
            return balance == 0;
        }

        public int getAccountNumber() {
            return number;
        }

        void validatePin(String fromPin) throws InvalidPinException {
            if(!(fromPin.length() == 4) && !fromPin.equals(pin))
                throw new InvalidPinException("Invalid pin");

            this.pin = fromPin;
        }

        public void setPin(String pin) {
            this.pin = pin;
        }

        public int checkAccountNumber() {
            return number;
        }
    }



