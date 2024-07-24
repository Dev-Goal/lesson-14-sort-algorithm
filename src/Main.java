import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] ints = new int[10];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = ((int) (Math.random() * 100)) + 1;
        }
        for (int i = 0; i < ints.length-1; i++) {
            for (int j = 0; j < ints.length-1 - i; j++) {
                if (ints[j] > ints[j + 1]) {
                    int temp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(ints));
    }
}