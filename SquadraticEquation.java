import java.util.Scanner;
public class SquadraticEquation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число а");
        float a = scanner.nextFloat();
        System.out.println("Введите число b");
        float b = scanner.nextFloat();
        System.out.println("Введите число c");
        float c = scanner.nextFloat();
        float D=b*b-4*a*c;;
        System.out.println("Вычисляем дискриминант, D = b*b-4a*c");
        System.out.println("d = " + D);
        System.out.println("Решение уравнения зависит от величины дискриминанта");
        if (D>0) {
            double x1 = (-b+Math.sqrt(D))/2*a;
            double x2 = (-b-Math.sqrt(D))/2*a;
            System.out.println("Дискриминант больше нуля, корни уравнения равны х1=" + x1 +  ";  x2= " + x2);
        }
        else if (D==0) {
            double x = -b / (2 * a);;
            System.out.println("Дискриминант равен нулю, x= " + x);
        }
        else

            System.out.println("Уравнение не имеет решений");


    }

}
