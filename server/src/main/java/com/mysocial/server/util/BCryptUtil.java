//package com.mysocial.server.util;
//
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//public class BCryptUtil {
//
//    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
//
//    public static String getBCryptPasswordEncoder(String value) {
//        return encoder.encode(value);
//    }
//
//    public static boolean matchesBCryptPasswordEncoder(String rawPassword, String encodedPassword) {
//        return encoder.matches(rawPassword, encodedPassword);
//    }
//
////    public static String decodeBCryptPasswordEncoder(String value){
////        return encoder.upgradeEncoding()
////    }
//
//    /**
//     * how to use BCryptUtil
//     * * getBCryptPasswordEncoder
//     * * matchesBCryptPasswordEncoder
//     *
//     * @param args
//     */
//    public static void main(String[] args) {
//
//        String yourPassword = "Nghiaxpes1";
//
//        // Generate bcrypt hash for the plain password
//        String hashedPassword = getBCryptPasswordEncoder(yourPassword);
//
//        System.out.println("Plaintext password: " + yourPassword);
//        System.out.println("BCrypt hashed password: " + hashedPassword);
//
//        // Check if the plaintext password matches the bcrypt hash
//        boolean isMatch = matchesBCryptPasswordEncoder(yourPassword, hashedPassword);
//        System.out.println("Password matches: " + isMatch);
//
//    }
//
//}
