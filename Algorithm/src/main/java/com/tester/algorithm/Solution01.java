package com.tester.algorithm;

import com.tester.solution.Customer;
import com.tester.solution.Transaction;
import com.tester.solution.TransactionRegistrationPortal;
import com.tester.solution.TransactionRegistrationPortalImpl;

public class Solution01 {

    public static void main(String[] args) {
        TransactionRegistrationPortal portal = TransactionRegistrationPortalImpl.getInstance();
        portal.registerTransaction(new Customer(1, "John", "jone@gmail.com"), new Transaction("some tx1", 1));
        portal.registerTransaction(new Customer(1, "John", "jone@gmail.com"), new Transaction("some tx1", 1));
        portal.registerTransaction(new Customer(1, "John", "jone@gmail.com"), new Transaction("some tx2", 2));
        portal.registerTransaction(new Customer(1, "John", "jone@gmail.com"), new Transaction("some tx3", 3));
        portal.registerTransaction(new Customer(1, "John", "jone@gmail.com"), new Transaction("some tx4", 4));


        portal.registerTransaction(new Customer(2, "Amit", "amit@gmail.com"), new Transaction("some tx1", 1));
        portal.registerTransaction(new Customer(2, "Amit", "amit@gmail.com"), new Transaction("some tx2", 2));
        portal.registerTransaction(new Customer(2, "Amit", "amit@gmail.com"), new Transaction("some tx3", 3));
        portal.registerTransaction(new Customer(2, "Amit", "amit@gmail.com"), new Transaction("some tx4", 4));
        portal.registerTransaction(new Customer(2, "Amit", "amit@gmail.com"), new Transaction("some tx5", 5));
// will get the CustomerNotFoundException
        System.out.println(portal.getTransactions(new Customer(1, "John", "jone@gmail.com")));
        System.out.println(portal.getTransactions(new Customer(1, "John", "jone@gmail.com")).size());
        //portal.getTransactions(new Customer(1, "Singh", ""));


    }


    public static void main1(String[] args) {
        /*Create classes: Customer, Transaction, and TransactionRegistrationPortal.

The Customer class should have:
- id: long
- name: string
- email: string

The Transaction class should have:
- details: string
- timestamp: long

The TransactionRegistrationPortal class should have 3 methods with the following signatures:
- TransactionRegistrationPortal getRegistrationPortal() {}
- void registerTransaction(Customer customer, Transaction trx) {}
- List<Transactions> getTransactions(Customer customer) {}*/




        /*
        * There can be only one instance of the registration portal.
- Only unique transactions can be stored per customer - unique pairs of details and timestamp
- getTransactions method should returns the transactions ordered from the oldest one
- in case of attempt to get transaction for unknown user, raise CustomerNotFoundException.
has context menu
        *
        * */
    }

}
