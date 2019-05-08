package com.tester.serilization.case4;

public class Balance {

    private Double balance;
    private String previousTransactionType;
    private Double frozenBalance;

    public Balance(Double balance, String previousTransactionType, Double frozenBalance) {
        this.balance = balance;
        this.previousTransactionType = previousTransactionType;
        this.frozenBalance = frozenBalance;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getPreviousTransactionType() {
        return previousTransactionType;
    }

    public void setPreviousTransactionType(String previousTransactionType) {
        this.previousTransactionType = previousTransactionType;
    }

    public Double getFrozenBalance() {
        return frozenBalance;
    }

    public void setFrozenBalance(Double frozenBalance) {
        this.frozenBalance = frozenBalance;
    }

    @Override
    public String toString() {
        return "Balance{" +
                "balance=" + balance +
                ", previousTransactionType='" + previousTransactionType + '\'' +
                ", frozenBalance=" + frozenBalance +
                '}';
    }
}
