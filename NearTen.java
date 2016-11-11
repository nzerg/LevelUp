import java.util.Scanner;

/**
 * Created by Zerg on 23.10.2016.
 */
public class NearTen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое любое число а");
        double a = scan.nextDouble();
        System.out.println("Введите второе любое число b");
        double b = scan.nextDouble();
        double n1 = Math.abs(10.0 - a);
        double n2 = Math.abs(10.0 - b);
        if (n1 < n2) {
            System.out.println("число а ближе к 10 чем число b");
        } else {
            if (n1 > n2) {
                System.out.println("число b ближе к 10 чем число a");

            } else {
                System.out.println("числа а и b находятся на одном расстоянии от 10");
            }
        }
    }

}
