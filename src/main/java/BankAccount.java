public class BankAccount {

    private long accountNumber;
    private double balance;
    private String accountHolderName;

    public String deposit(double amount) {
        if(amount<0) return "invalid amount";
        balance+=amount;
        return "Amount deposited successfully";

    }

}
