import java.util.Scanner;

public class U9GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        switch (type){
            case "int":
                System.out.println(getMax(Integer.parseInt(a),
                        Integer.parseInt(b)));
                break;
            case "char":
                System.out.println(getMax(a.charAt(0), b.charAt(0)));
                break;
            default:
                System.out.println(getMax(a, b));
                break;
        }
    }

    public static int getMax(int a, int b){
        return Math.max(a, b);
    }

    public static String getMax(String a, String b){
        if (a.compareTo(b) >= 0){
            return a;
        }
        else {
            return b;
        }
    }

    public static char getMax(char a, char b){
        if (a >= b){
            return a;
        }
        else {
            return b;
        }
    }
}