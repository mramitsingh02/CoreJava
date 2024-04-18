package com.tester.solution;

import java.util.Iterator;
import java.util.List;

public class Transactions implements Iterable<Transaction> {
    private final List<Transaction> transactions;

    public Transactions(final List<Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public Iterator<Transaction> iterator() {
        return transactions.iterator();
    }
}
