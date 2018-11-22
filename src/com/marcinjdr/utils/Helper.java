package com.marcinjdr.utils;

import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class Helper {

    private final static String HASHING_ALGORITHM = "SHA-256";

    private Helper() {
    }

    public static String getSha256Hash(final Object object) throws NoSuchAlgorithmException, IOException {
        final MessageDigest digest = MessageDigest.getInstance(HASHING_ALGORITHM);

        final byte[] bytes = objectToByteArray(object);
        final byte[] hash = digest.digest(bytes);

        return Base64.getEncoder().encodeToString(hash);
    }

    private static byte[] objectToByteArray(final Object object) throws IOException {
        if (object == null) {
            return new byte[]{};
        }

        try (OutputStream outputStream = new ByteArrayOutputStream();
             ObjectOutput output = new ObjectOutputStream(outputStream)) {
            output.writeObject(object);
            return ((ByteArrayOutputStream) outputStream).toByteArray();
        }
    }
}
