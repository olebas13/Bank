package domain;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Customer> customers = new ArrayList<Customer>();
    private static int numOfClients = 0;
    private static Bank myBank = new Bank();

    private Bank() {

    }

    public Customer getCustomer(int cusNumber) {
        if (cusNumber < customers.size()) {
            return customers.get(cusNumber);
        }
        return null;
    }

    public void addCustomer(Customer newCustomer) {
        customers.add(newCustomer);
        numOfClients++;
    }

    public int getNumOfClients() {
        return numOfClients;
    }

    public static Bank getBank() {
        return myBank;
    }
}
