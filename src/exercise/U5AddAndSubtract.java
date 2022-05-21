package exercise;

import java.util.Scanner;

public class U5AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int sum = sum(num1, num2);
        subtract(sum, num3);

    }
    static int sum(int a, int b){
        return a + b;
    }
    static void subtract(int result, int c){
        result -= c;
        System.out.println(result);
    }
}