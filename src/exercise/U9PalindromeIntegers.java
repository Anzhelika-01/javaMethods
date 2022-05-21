package exercise;

import java.util.Scanner;

public class U9PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();

        while (!num.equals("END")){
            boolean palindrome = true;
            int middle = num.length() - 1;
            for (int i = 0; i < num.length()/2; i++){
                if (num.charAt(i) == num.charAt(middle)){
                    middle--;
                }
                else {
                    palindrome = false;
                }
            }
            if (palindrome){
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }
            num = scanner.nextLine();
        }
    }
}