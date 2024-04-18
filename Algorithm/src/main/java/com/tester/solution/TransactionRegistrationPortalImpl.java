package com.tester.solution;

import java.util.List;

public class TransactionRegistrationPortalImpl implements TransactionRegistrationPortal {
    private static TransactionRegistrationPortalImpl instance;
    TestDatabase testDatabase = new TestDatabase();
    public static TransactionRegistrationPortalImpl getInstance() {
        if (instance == null) {
            synchronized (TransactionRegistrationPortalImpl.class) {
                if (instance == null) {
                    instance = new TransactionRegistrationPortalImpl();
                }
            }
        }
        return instance;
    }


    @Override
    public TransactionRegistrationPortal getRegistrationPortal() {
        return instance;
    }

    @Override
    public void registerTransaction(final Customer customer, final Transaction trx) {
        testDatabase.setCustomerTransaction(customer, trx);

    }

    @Override
    public List<Transaction> getTransactions(final Customer customer) {

        if (testDatabase.getCustomer(customer) != null) {
            return testDatabase.getTransactions(customer);
        }
        return null;
    }
}
