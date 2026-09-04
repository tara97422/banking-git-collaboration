public class BankAccount {

    private long accountNumber;

    private double balance=10000;

    private String accountHolderName;

    public String deposit(double amount) {
        if(amount<0) return "invalid amount";
        balance+=amount;
        return "Amount deposited successfully";

    }

    public String withdraw(double amount){
        if(amount>balance) return "insufficient Balance";
        balance-=amount;
        return "amount withdrawn succesffully";
    }

    public String isActive(){
        if(balance>0) return "Account is active";
        return "Account is inactive";
    }
    
    public String validateAccountHolder() {
    if (accountHolderName == null || accountHolderName.trim().isEmpty()) {
        return "Invalid account holder name";
    }
    return "Valid account holder name";
}

    
}
