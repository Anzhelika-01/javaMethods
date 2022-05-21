package exercise;

import java.util.Scanner;

public class U3CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printCharacters(scanner);
    }

    static void printCharacters(Scanner scanner){
        char firstChar = scanner.next().charAt(0);
        char secondChar = scanner.next().charAt(0);

        if (secondChar > firstChar) {
            for (int i = firstChar + 1; i < secondChar; i++) {
                System.out.print((char) i + " ");
            }
        }
        else {
            for (int i = secondChar + 1; i < firstChar; i++) {
                System.out.print((char) i + " ");
            }
        }
    }
}