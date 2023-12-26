package FirstJava;
import java.util.Scanner;
public class N4 {
  public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
    System.out.println("Введите вещественное число с ненулевой дробной частью: ");
    double n = scan.nextDouble();
      long a = Math.round(n);
      System.out.println(a);



  }


}
