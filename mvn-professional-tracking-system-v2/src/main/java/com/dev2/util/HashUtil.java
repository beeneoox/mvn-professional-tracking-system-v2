/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev2.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import org.jboss.logging.Logger;

/**
 *
 * @author Bruno
 */
public class HashUtil {
    
    public static String stringToMD5(String string) {
        
        String MD5 = null;
        
        if (string == null) {
            return null;
        }
        
        MessageDigest digest;
        
        try {
            digest = MessageDigest.getInstance("MD5");
            digest.update(string.getBytes(), 0, string.length());
            
            MD5 = new BigInteger(1, digest.digest()).toString(16);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(HashUtil.class.getName()).log(Logger.Level.FATAL, ex);
        }
        
        return MD5;
        
    }
    
}
