import java.text.DecimalFormat;
import java.util.Scanner;

public class U8MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        int power = scanner.nextInt();
        double result = power(number, power);
        System.out.println(new DecimalFormat("0.####").format(result));
    }

    public static double power(double n, int p){
        return Math.pow(n, p);
    }
}