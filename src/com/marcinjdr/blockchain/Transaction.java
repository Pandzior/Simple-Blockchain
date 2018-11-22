package com.marcinjdr.blockchain;

import java.io.Serializable;

public class Transaction implements Serializable {

    private double amount;
    private String from;
    private String to;

    public Transaction() {
    }

    public Transaction(final double amount, final String from, final String to) {
        this.amount = amount;
        this.from = from;
        this.to = to;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(final double amount) {
        this.amount = amount;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(final String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(final String to) {
        this.to = to;
    }
}
