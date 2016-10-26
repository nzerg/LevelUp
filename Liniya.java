import java.util.Scanner;

public class Liniya {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число а");
        if(scanner.hasNextInt()) { 
        int a = scanner.nextInt();}
        else {
          System.out.println("Вы ввели не целое число");
        }
        System.out.println("Введите целое число b");
        if(scanner.hasNextInt()) { 
        int b = scanner.nextInt(); }
        else {
          System.out.println("Вы ввели не целое число");
        }
      
       double x = -b/a;
        System.out.println(x);

    }

}
