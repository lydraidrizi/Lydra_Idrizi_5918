class SavingsAccount extends Account {

    double interestRate;



    SavingsAccount(String accountNumber, double balance, double interestRate) {

        super(accountNumber, balance);

        this.interestRate = interestRate;

    }



    @Override

    public String toString() {

        return "Savings Account - Account Number: " + accountNumber + ", Balance: $" + balance + ", Interest Rate: " + interestRate + "%";

    }

}

}
