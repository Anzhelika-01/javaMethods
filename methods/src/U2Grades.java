import java.util.Scanner;

public class U2Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gr = Double.parseDouble(scanner.nextLine());
        grade(gr);
    }

    public static void grade(double gr){
        if (gr >= 2.00 && gr <= 2.99){
            System.out.println("Fail");
        }
        else if (gr > 2.99 && gr <= 3.49){
            System.out.println("Poor");
        }
        else if (gr > 3.49 && gr <= 4.49){
            System.out.println("Good");
        }
        else if (gr > 4.49 && gr <= 5.49){
            System.out.println("Very good");
        }
        else if (gr > 5.49 && gr <= 6.00){
            System.out.println("Excellent");
        }
    }
}