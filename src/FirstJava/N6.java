package FirstJava;
import java.util.Scanner;
public class N6 {
    public static void main(String[] args) {
        System.out.println("Введите переменную а:");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("Введите еременную b:");
        int b = scan.nextInt();
        a += b;
        b = a - b;
        a -= b;
        System.out.println("a=" + a);

        System.out.println("b=" + b);
    }
}
