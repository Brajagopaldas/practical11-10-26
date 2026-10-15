class BankAccount {
    int accountNo;
    String holderName;
    double balance;
    String accountType;

    BankAccount(int accountNo, String holderName, double balance, String accountType) {
        this(accountNo, holderName, balance);
        this.accountNo = accountNo;
        this.holderName = holderName;
        this.balance = balance;
        this.accountType = accountType;
    }

    BankAccount(int accountNo, String holderName, double balance) {
        this.accountNo = accountNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    BankAccount(int accountNo, String holderName) {
        this(accountNo, holderName, 98000, "Saving account");
        this.accountNo = accountNo;
        this.holderName = holderName;
    }

    void display() {
        System.out.println("Bank account: " + accountNo + "\n Holder name: " + holderName + "\n Balance: " + balance
                + "\n Account type: " + accountType);
    }

    public static void main(String[] args) {
        BankAccount ba = new BankAccount(5689788, "Dhanish kumar");
        ba.display();

    }

}