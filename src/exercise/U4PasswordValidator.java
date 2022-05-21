package exercise;

import java.util.Scanner;

public class U4PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        int digitCounter = 0;
        boolean valid = true;

        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 48 && password.charAt(i) <= 57) {
                digitCounter++;
            }
            if (password.charAt(i) < 48 || password.charAt(i) > 57 &&
                    password.charAt(i) < 65 || password.charAt(i) > 122) {
                valid = false;
            }
        }

        if (password.length() < 6 || password.length() > 10) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!valid) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (digitCounter < 2) {
            System.out.println("Password must have at least 2 digits");
        }
        if (digitCounter >= 2 && password.length() >= 6
                && password.length() <= 10 && valid) {
            System.out.println("Password is valid");
        }
    }
}