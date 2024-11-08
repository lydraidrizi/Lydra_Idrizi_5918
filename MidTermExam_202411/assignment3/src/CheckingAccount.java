class CheckingAccount extends Account {

    double transactionLimit;



    CheckingAccount(String accountNumber, double balance, double transactionLimit) {

        super(accountNumber, balance);

        this.transactionLimit = transactionLimit;

    }



    @Override

    public String toString() {

        return "Checking Account - Account Number: " + accountNumber + ", Balance: $" + balance + ", Transaction Limit: " + transactionLimit;

    }

}
