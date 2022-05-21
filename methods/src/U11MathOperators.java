import java.text.DecimalFormat;
import java.util.Scanner;

public class U11MathOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        int b = scanner.nextInt();
        double result = calculate(a, operator, b);
        System.out.println(new DecimalFormat("0.##").
                format(result));
    }

    public static double calculate(int a, char operator, int b){
        switch (operator){
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            default:
                return a * 1.0 / b;
        }
    }
}