package exercise;

import java.util.Scanner;

public class U8FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        double factorial1 = factorial(num1);
        double factorial2 = factorial(num2);
        double result = divide(factorial1, factorial2);
        System.out.printf("%.2f", result);
    }
    static double factorial(int a){
        double factorial = 1;
        for (int i = 1; i <= a; i++){
            factorial *= i;
        }
        return factorial;
    }

    static double divide(double factorial1, double factorial2){
        return factorial1 / factorial2;
    }
}