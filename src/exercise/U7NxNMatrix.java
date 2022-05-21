package exercise;

import java.util.Scanner;

public class U7NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        nxn(scanner);
    }
    static void nxn(Scanner scan){
        int n = scan.nextInt();
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}