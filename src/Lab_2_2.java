import java.util.Scanner;

public class Lab_2_2 {
    public static int m(int n) {
        int o;
        int count;
        if (n == 1) {
            System.out.print(" 1");
            return 0;
        } else {
            if (n % 2 == 0) {
                System.out.print(" 0");
                return m(n = n / 2);
            } else {
                o = n % 2;
                System.out.print(" 1");
                return m( n = (n-o)/2);
            }
        }
    }
    public static void main(String[]args) {
        int ch;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        ch =scan.nextInt();
        m(ch);
    }
}

