package com.tester.solution;

import com.tester.solution.exception.CustomerNotFoundException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class TestDatabase {
    static List<Customer> customers = new ArrayList<>();
    static Map<Customer, Set<Transaction>> customerTrx = new ConcurrentHashMap<>();

    static {
        customers.add(new Customer(1, "John", "jone@gmail.com"));
        customers.add(new Customer(2, "Amit", "amit@gmail.com"));
    }

    public List<Transaction> getTransactions(final Customer customer) {
        final Customer dbCustomer = getCustomer(customer);
        final Set<Transaction> transactions = customerTrx.get(dbCustomer);
        return transactions.stream().sorted(Comparator.comparing(Transaction::timestamp).reversed()).collect(Collectors.toList());
    }

    public Customer getCustomer(final Customer customer) {
        return customers.stream().filter(c -> c.name().equals(customer.name())).findFirst().orElseThrow(() -> new CustomerNotFoundException("Customer not found!" + customer.name() + " " + customer.email()));
    }


    public void setCustomerTransaction(final Customer customer, final Transaction trx) {

        if (customerTrx.containsKey(customer)) {
            customerTrx.get(customer).add(trx);
        } else {
            final HashSet<Transaction> value = new HashSet<>();
            value.add(trx);
            customerTrx.putIfAbsent(customer, value);
        }

    }
}
