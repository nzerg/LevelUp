/**
 * Created by Zerg on 01.11.2016.
 */
public class FindMin {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 9, 100, 1000, 55, -25, 44, 88, 0};
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Минимальное значение массива равно " + min);
    }
}

