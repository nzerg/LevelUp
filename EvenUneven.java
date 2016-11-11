import java.util.Scanner;

/**
 * Created by Zerg on 23.10.2016.
 */
public class EvenUneven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое число больше 0");
        int n = scan.nextInt();
        if (n > 0) {
            if (n % 2 == 0) {
                System.out.println("Число четное");
            } else {
                System.out.println("Число нечетное");
            }
        } else {
            System.out.println("Введено неверное число");
        }
    }
}
