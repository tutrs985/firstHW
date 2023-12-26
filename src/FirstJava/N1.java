package FirstJava;

import java.util.Scanner;
public class N1 {
    public static void main(String[] args){

        System.out.println("Введите первое число:");
        Scanner scan = new Scanner(System.in);
        float b = scan.nextFloat();
        System.out.println("Введите второе число:");
        Scanner scan2 = new Scanner(System.in);
        float c = scan.nextFloat();

        float a = 4*(b+c-1)/2;

        System.out.println("Результат:" + a);













    }

}
