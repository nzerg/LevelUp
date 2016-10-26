import java.util.Scanner;

/**
 * Created by Zerg on 23.10.2016.
 */
public class NearTen2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое любое число а");
        float a = scan.nextFloat();
        System.out.println("Введите второе любое число b");
        float b = scan.nextFloat();
        System.out.println("Введите третье любое число c");
        float c = scan.nextFloat();
        float n1 = c - a;
        float n2 = c - b;
        if (n1 < n2) {
            System.out.println("число а ближе к числу " + c + " чем число b");
        } else if (n1 > n2) {
            System.out.println("число b ближе к числу " + c + " чем число a");

        } else System.out.println("числа а и b находятся на одном расстоянии от числа " + c);
    }

}
