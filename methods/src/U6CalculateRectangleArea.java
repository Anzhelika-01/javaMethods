import java.util.Scanner;

public class U6CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = scanner.nextInt();

        int area = area(width, length);
        System.out.println(area);
    }
    public static Integer area(int a, int b){
        return a * b;
    }
}