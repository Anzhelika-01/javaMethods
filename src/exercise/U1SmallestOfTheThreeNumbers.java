package exercise;

import java.util.Scanner;

public class U1SmallestOfTheThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[3];
        int min = Integer.MAX_VALUE;

        min = getMax(scanner, num, min);
        System.out.println(min);
    }

    private static int getMax(Scanner scanner, int[] num, int min) {
        for (int i = 0; i < 3; i++) {
            num[i] = Integer.parseInt(scanner.nextLine());
            if (num[i] < min) {
                min = num[i];
            }
        }
        return min;
    }
}