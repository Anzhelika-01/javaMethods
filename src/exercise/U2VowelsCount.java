package exercise;

import java.util.Scanner;

public class U2VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int counter = 0;

        counter = findVowels(str, counter);
        System.out.println(counter);
    }

    static int findVowels(String str, int counter){
        for (int i = 0; i < str.length(); i++){
            char letter = str.toLowerCase().charAt(i);
            if (letter == 'a' || letter == 'o' || letter == 'u' ||
                    letter == 'i' || letter == 'e' || letter == 'y'){
                counter++;
            }
        }
        return counter;
    }
}