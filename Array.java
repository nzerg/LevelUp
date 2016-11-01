import java.util.Random;

/**
 * Created by Zerg on 01.11.2016.
 */
public class Array {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            Random random = new Random();
            numbers[i] = random.nextInt(2);
            System.out.println(numbers[i]);
        }

    }
}
