package domain;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BankTest {

    Bank bank = Bank.getBank();

    Customer firstCustomer = new Customer("John Doe");
    Customer secondCustomer = new Customer("Jane Doe");



    @Before
    public void setUp() throws Exception {
        SavingsAccount johnSavings = new SavingsAccount(1000, 5);
        CheckingAccount johnAccount = new CheckingAccount(5000, 1000);
        CheckingAccount janeAccount = new CheckingAccount(500, 100);

        firstCustomer.addAccount(johnSavings);
        firstCustomer.addAccount(johnAccount);
        secondCustomer.addAccount(janeAccount);
        bank.addCustomer(firstCustomer);
        bank.addCustomer(secondCustomer);
    }

    @Test
    public void testGetCustomer() {
        System.out.println("getCustomer");
        int custNo = 0;
        Bank instance = bank;
        Customer expResult = firstCustomer;
        Customer result = instance.getCustomer(custNo);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetBank() {
        System.out.println("getBank - only one instance of Bank");
        Bank expResult = bank;
        Bank result = Bank.getBank();
        assertEquals(expResult, result);
    }
}