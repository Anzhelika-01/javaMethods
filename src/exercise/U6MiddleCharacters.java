package exercise;

import java.util.Scanner;

public class U6MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        middleCharacter(str);
    }
    static void middleCharacter(String str1){
        if (str1.length() % 2 == 0){
            char firstMiddle = str1.charAt((str1.length()/2) - 1);
            char secondMiddle = str1.charAt(str1.length()/2);
            System.out.println(firstMiddle + "" + secondMiddle);
        }
        else {
            System.out.println(str1.charAt(str1.length() / 2));
        }
    }
}