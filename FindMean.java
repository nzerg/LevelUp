import java.util.Scanner;

/**
 * Created by Zerg on 23.10.2016.
 */
public class FindMean {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое число а");
        int a = scan.nextInt();
        System.out.println("Введите целое число b");
        int b = scan.nextInt();
        System.out.println("Введите целое число c");
        int c = scan.nextInt();
        int d = (b + a + c) / 3;
        System.out.println("Среднее значение этих трех чисел равно " + d);

    }
}
