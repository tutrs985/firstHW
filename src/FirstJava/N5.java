package FirstJava;
import java.util.Scanner;
public class N5 {
    public static void main(String[] args) {
        System.out.println("Введите q:");
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        System.out.println("Введите w:");
        int w = scan.nextInt();
        int del = q/w;
        System.out.println(del);
        int ost = q%w;
        System.out.println(ost);

    }
}
