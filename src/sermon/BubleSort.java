package sermon;

public class BubleSort {
    public static void main(String[] args) {
        int[] array = {64,32,25,12,22,11,98};
        int length = array.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        printArray(array);
    }
    private static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
