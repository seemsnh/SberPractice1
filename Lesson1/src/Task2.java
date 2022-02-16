import java.util.Arrays;

public class Task2 {

    public static void QuickSort(int[] array, int begin, int end){
        if (begin < end){
            int partitionIndex = Partition(array, begin, end);
            QuickSort(array, begin, partitionIndex-1);
            QuickSort(array, partitionIndex+1, end);
        }
    }

    public static int Partition(int[] array, int begin, int end){
        int pivot = array[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (array[j] <= pivot) {
                i++;

                int buffer = array[i];
                array[i] = array[j];
                array[j] = buffer;
            }
        }

        int buffer = array[i+1];
        array[i+1] = array[end];
        array[end] = buffer;

        return i+1;
    }

    public static void main(String[] args) {
        int[] _array = {7, 2, 3, 67, 4 ,2, 10, 111, 67};
        System.out.println("Unsorted array " + Arrays.toString(_array));
        QuickSort(_array, 0, _array.length-1);
        System.out.println("Sorted array " + Arrays.toString(_array));
    }
}
