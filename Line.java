import java.util.Scanner;

public class Line {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число а");
        boolean result = true;
        int a;
        {
            while (result) {
                a = scanner.nextInt();
                if (scanner.hasNextInt()) {
                    result = true;
                    System.out.println("верно - " + a);
                } else {
                    result = false;
                    System.out.println("Число не целое, меня не обманешь) введите целое");
                }
            }

            System.out.println("Введите целое число b");
            int b = scanner.nextInt();
            //    double x = -b / a;
        }
        //System.out.println(x);

    }

}