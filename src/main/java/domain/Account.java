package domain;

/**
 *
 * @author olebas
 */
public class Account {
    protected double balance;

    /**
     * Default public constructor
     */
    public Account() {
        this.balance = 0;
    }

    /**
     * Constructor that provides initial balance
     * @param initBalance a positive account balance
     */
    protected Account(double initBalance) {
        if (initBalance >= 0) {
            this.balance = initBalance;
        } else {
            this.balance = 0;
        }
    }

    /**
     * Method to check account balance
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Method to add money to account
     * @param amt a positive amount of money
     * @return
     */
    public boolean deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            return true;
        }
        return false;
    }

    /**
     * Method to withdraw money
     * @param amt a positive amount of money
     * @return
     */
    public boolean withdraw(double amt) throws Exception {
        if (amt <= 0) {
            balance -= amt;
            return true;
        }
        return false;
    }
}
