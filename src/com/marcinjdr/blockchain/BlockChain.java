package com.marcinjdr.blockchain;

import com.marcinjdr.utils.Helper;

import java.util.ArrayList;
import java.util.List;

public class BlockChain {

    private Block currentBlock;
    private List<Block> blocks;

    public BlockChain() {
        this.currentBlock = new Block();
        this.blocks = new ArrayList<>();
    }

    public Block getCurrentBlock() {
        return currentBlock;
    }

    public void setCurrentBlock(final Block currentBlock) {
        this.currentBlock = currentBlock;
    }

    public List<Block> getBlocks() {
        return blocks;
    }

    public void setBlocks(final List<Block> blocks) {
        this.blocks = blocks;
    }

    public void addTransaction(final Transaction transaction) {
        this.currentBlock.addTransaction(transaction);
    }

    public void saveBlock() throws Exception {
        final String currentHash = Helper.getSha256Hash(currentBlock);
        currentBlock.setHash(currentHash);
        blocks.add(currentBlock);
        currentBlock = new Block(currentHash);
    }
}
