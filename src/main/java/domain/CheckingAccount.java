package domain;

public class CheckingAccount extends Account {
    private double overdraftAmount;

    public CheckingAccount(double initBalance, double overdraftAmount) {
        balance = initBalance;
        this.overdraftAmount = overdraftAmount;
    }

    public CheckingAccount(double initBalance) {
        this(initBalance, 0);
    }

    public double getOverdraftAmount() {
        return overdraftAmount;
    }

    @Override
    public boolean withdraw(double amt) throws OverdraftException {
        if (amt <= balance + overdraftAmount) {
            balance = balance - amt;
            return true;
        }
        throw new OverdraftException("Error! Insufficient funds!", amt - balance - overdraftAmount);
    }
}
