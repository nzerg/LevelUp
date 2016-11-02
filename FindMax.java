/**
 * Created by Zerg on 01.11.2016.
 */
public class FindMax {
    public static void main(String[] args) {
        int[] array = new int[]{1, 5, 9, 100, 1000, 55, -25, 44, 88, 0};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

        }
        System.out.println("Максимальное число в массиве равно " + max);
    }
}
