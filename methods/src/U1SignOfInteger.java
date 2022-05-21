import java.util.Scanner;

public class U1SignOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        sign(n);
    }

    private static void sign(int n) {
        if (n == 0){
            System.out.printf("The number %d is zero.", n);
        }else if (n > 0){
            System.out.printf("The number %d is positive.", n);
        }else {
            System.out.printf("The number %d is negative.", n);
        }
    }
}