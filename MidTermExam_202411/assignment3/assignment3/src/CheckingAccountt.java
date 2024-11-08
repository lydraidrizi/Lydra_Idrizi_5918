class CheckingAccountt extends Account {

    double transactionLimit;



    CheckingAccountt(String accountNumber, double balance, double transactionLimit) {

        super(accountNumber, balance);

        this.transactionLimit = transactionLimit;

    }



    @Override

    public String toString() {

        return "Checking Account - Account Number: " + accountNumber + ", Balance: $" + balance + ", Transaction Limit: " + transactionLimit;

    }

}
