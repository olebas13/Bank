package domain;

public class AccumulateSavingsBatch {

    public AccumulateSavingsBatch() {

    }

    public void doBatch() {
        Bank bank = Bank.getBank();

        for (int cust_idx = 0; cust_idx < bank.getNumOfClients(); cust_idx++) {
            Customer customer = bank.getCustomer(cust_idx);

            for (int acct_idx = 0; acct_idx < customer.getNumOfAccounts(); acct_idx++) {
                Account account = customer.getAccount(acct_idx);
                String account_type = "";

                if (account instanceof SavingsAccount) {
                    SavingsAccount savings = (SavingsAccount) account;
                    savings.addInterestRate();
                } else {

                }
            }
        }
    }
}
