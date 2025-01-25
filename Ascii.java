import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the alphabet");
        char ch = sc.next().charAt(0);
        System.out.println((int)ch);
        sc.close();
    }
}
