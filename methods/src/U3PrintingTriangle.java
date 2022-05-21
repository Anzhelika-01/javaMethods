import java.util.Scanner;

public class U3PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++){
            triangle(1, i);
        }
        triangle(1, n);
        for (int i = n -1; i >= 1; i--){
            triangle(1, i);
        }
    }
    public static void triangle(int start, int end){
        for (int i = start; i <= end; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}