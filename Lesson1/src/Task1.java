import java.util.Arrays;

public class Task1 {

    public static void BubbleSort(int[] array){
        boolean isSorted = false;
        while (!isSorted){
            isSorted = true;
            for (int i = 0; i<array.length-1; i++){
                if (array[i]>array[i+1]){
                    int buffer = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buffer;
                    isSorted = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] _array = {7, 2, 3, 67, 4 ,2, 10, 111, 67};
        System.out.println("Unsorted array " + Arrays.toString(_array));
        BubbleSort(_array);
        System.out.println("Sorted array " + Arrays.toString(_array));
    }
}
