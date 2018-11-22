package com.marcinjdr.blockchain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Block implements Serializable {

    private String hash;
    private String previousHash;
    private List<Transaction> transactions;

    public Block() {
        this.transactions = new ArrayList<>();
    }

    public Block(final String previousHash) {
        this.previousHash = previousHash;
        this.transactions = new ArrayList<>();
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getPreviousHash() {
        return previousHash;
    }

    public void setPreviousHash(String previousHash) {
        this.previousHash = previousHash;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public void addTransaction(final Transaction transaction) {
        this.transactions.add(transaction);
    }
}
