import java.util.Scanner;

public class U7RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        String newText = repeat(text, n);
        System.out.println(newText);
    }

    public static String repeat(String text, int n){
        String newText = "";
        for (int i = 0; i < n; i++){
            newText = newText + text;
        }
        return newText;
    }
}