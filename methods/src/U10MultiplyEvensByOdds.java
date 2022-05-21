import java.util.Scanner;

public class U10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Math.abs(Integer.parseInt(scanner.nextLine()));
        System.out.println(getMultipleOfEvensAndOdds(num));
    }

    public static int getMultipleOfEvensAndOdds(int n){
        return getMultipleOfEvens(n) * getMultipleOfOdds(n);
    }
    public static int getMultipleOfEvens(int n) {
        int evenSum = 0;
        while (n != 0) {
            int digits = n % 10;
            if (digits % 2 == 0) {
                evenSum += digits;
            }
            n /= 10;
        }
        return evenSum;
    }
    public static int getMultipleOfOdds(int n){
        int oddSum = 0;
        while (n != 0) {
            int digits = n % 10;
            if (digits % 2 == 1) {
                oddSum += digits;
            }
            n /= 10;
        }
        return oddSum;
    }
}