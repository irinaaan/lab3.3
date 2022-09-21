import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = in.nextLine();
        System.out.println("Длина блока: " + checkStr(str));
    }

    public static int checkStr(String str) {
        char c = str.charAt(0);
        int max = 0;
        int ln = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                ln++;
            }
            else {
                c = str.charAt(i);
                ln = 1;
            }
            if (ln > max) {
                max = ln;
            }
        }
        return max;
    }
}