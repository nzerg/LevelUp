import java.util.Scanner;

/**
 * Created by Zerg on 23.10.2016.
 */
public class DaysYear {
    public static void main(String[] args) {
        System.out.println("Введите год в четырехзначном формате");
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        int a = year % 4;
        int b = year % 400;
        if (a != 0) {
            System.out.println("365 дней в вашем году");
        } else if (b == 0) {
            System.out.println("365 дней в вашем году");
        } else System.out.println("366 дней в вашем году");
    }
}
