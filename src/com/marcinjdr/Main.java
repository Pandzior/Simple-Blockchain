package com.marcinjdr;

import com.marcinjdr.utils.Helper;

public class Main {

    public static void main(String[] args) throws Exception {

        String[] test1 = {"a", "b", "c"};
        String[] test2 = {"a", "b", "c", "d"};

        System.out.println("Hash test1: " + Helper.getSha256Hash(test1));
        System.out.println("Hash test2: " + Helper.getSha256Hash(test2));
    }
}
