/*
    Project: Chen Hash Encryption Naming
    Made By: Jason H. (Programmer) and B. Chen (Hash Writer)
    Created: 28 September 2020
    Updated: 14 November 2020 (Edited print text and enhanced switch)
 */

import java.util.Scanner;

public class CHEN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("CHEN Encryption"); // title
        String description = "The CHEN (Chen Hash Encryption Naming) is a form of " +
                "encryption that uses the highest level of security by replacing the letters";
        System.out.println(description);

        System.out.println(); // prints extra line
        System.out.println("Would you like to encrypt or decrypt?");
        System.out.println("(encrypt) or (decrypt)");
        String option = input.next(); // options encrypt and decrypt

        System.out.println(); // prints extra line
        switch (option) {
            case "encrypt" -> ChenSupport.encrypt();
            case "decrypt" -> ChenSupport.decrypt();
            default -> System.out.println("Failed to understand. Run again");
        }
    }
}
