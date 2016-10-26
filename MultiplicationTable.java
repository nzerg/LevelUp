import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое число n больше 1");
        int n = scan.nextInt();
        System.out.println("Введите целое число m больше 1");
        int m = scan.nextInt();
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                System.out.printf("%5d", i * j);
            }
            System.out.println();
        }


    }
}
