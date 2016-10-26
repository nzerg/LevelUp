import java.util.Scanner;

/**
 * Created by Zerg on 23.10.2016.
 */
public class EvenUnevenTernar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое число больше 0");
        int n = scan.nextInt();
        int m = n % 2;
        String a = m != 0 ? "Число нечетное" : "Число четное";
        System.out.println(a);
    }
}
