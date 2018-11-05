package domain;

public class Bank {
    private static Customer[] customers = new Customer[1000];
    private static int numOfClients = 0;
    private static Bank myBank = new Bank();

    private Bank() {

    }

    public Customer getCustomer(int cusNumber) {
        if (cusNumber < customers.length) {
            return customers[cusNumber];
        }
        return null;
    }

    public void addCustomer(Customer newCustomer) {
        customers[numOfClients] = newCustomer;
        numOfClients++;
    }

    public int getNumOfClients() {
        return numOfClients;
    }

    public static Bank getBank() {
        return myBank;
    }
}
