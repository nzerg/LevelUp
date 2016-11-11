/**
 * Created by Zerg on 05.11.2016.
 */
public class FindElement {
    public static void main(String[] args) {
        int[] d = {125, 255, 5, 9, 44, 4878, 55, 33};
        for (int x : d) {
            System.out.printf(x + " ");
        }
        int value = 33;
        for (int x : d) {
            if (x == value) {
                System.out.println();
                System.out.println("Мы нашли искомый элемент " + value);
            }
            System.out.println("Мы не нашли элемент" + value);
        }
    }
}
