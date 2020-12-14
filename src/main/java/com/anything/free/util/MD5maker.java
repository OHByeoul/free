package com.anything.free.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5maker {
    private String result;

    public MD5maker(String input) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        MessageDigest messageDigestMD5 = MessageDigest.getInstance("MD5");
        messageDigestMD5.update(input.getBytes("UTF-8"));
        byte [] md5Hash = messageDigestMD5.digest();
        StringBuilder hexMD5Hash = new StringBuilder();

        for(byte b : md5Hash){
            String hexString = String.format("%02x",b);
            hexMD5Hash.append(hexString);
        }
        result = hexMD5Hash.toString();
    }
}
