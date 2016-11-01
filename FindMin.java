/**
 * Created by Zerg on 01.11.2016.
 */
public class FindMin {
    public static void main(String[] args) {
        int[] numbers = {-22, -6, 22, -23};
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Минимальное значение массива равно " + min);
    }
}

