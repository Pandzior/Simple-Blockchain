package com.marcinjdr;

import com.marcinjdr.blockchain.BlockChain;
import com.marcinjdr.blockchain.Transaction;

public class Main {

    public static void main(String[] args) throws Exception {

        final BlockChain simpleBlockChain = new BlockChain();

        final Transaction firstTransaction = new Transaction(123, "Marcin", "Maciej");
        final Transaction secondTransaction = new Transaction(56, "Maciej", "Piotr");
        final Transaction thirdTransaction = new Transaction(13, "Piotr", "Marcin");

        simpleBlockChain.addTransaction(firstTransaction);
        simpleBlockChain.addTransaction(secondTransaction);
        simpleBlockChain.addTransaction(thirdTransaction);

        simpleBlockChain.saveBlock();
        System.out.println(simpleBlockChain.getCurrentBlock().getPreviousHash());
        simpleBlockChain.saveBlock();
        System.out.println(simpleBlockChain.getCurrentBlock().getPreviousHash());
    }
}
