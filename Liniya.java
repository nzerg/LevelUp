import java.util.Scanner;

public class Liniya {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число а");
        int a = scanner.nextInt();
        System.out.println("Введите целое число b");
        int b = scanner.nextInt();
       double x = -b/a;
        System.out.println(x);

    }

}
