package exercise.exercise_8;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {3,7,9,5,3,6,8,4};
        int length = array.length;
        for (int i = 1; i < length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && temp < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
