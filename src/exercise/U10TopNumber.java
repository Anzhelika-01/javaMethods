package exercise;

import java.util.Scanner;

public class U10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        findTopNumber(n);
    }

    private static void findTopNumber(int num) {
        for (int i = 1; i <= num; i++){
            int sum = 0;
            boolean odd = false;
            for (int j = i; j > 0; j /= 10){
                sum += j % 10;
                if ((j % 10) % 2 == 1){
                    odd = true;
                }
            }
            if (sum % 8 == 0 && odd){
                System.out.println(i);
            }
        }
    }
}