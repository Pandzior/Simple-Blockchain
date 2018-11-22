package com.marcinjdr.blockchain;

import java.io.Serializable;

public class Transaction implements Serializable {

    private double amount;
    private String from;
    private String to;

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
