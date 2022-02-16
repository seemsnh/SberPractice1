import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int _length = 10;
        double[] _array = new double[_length];
        for (int i = 0; i < _array.length; i++){
            _array[i] = Math.random()*10;
        }
        double max = _array[0];
        double min = _array[0];
        double sum = 0;
        for (double n : _array) {
            if (max < n)
                max = n;
            if (min > n)
                min = n;
            sum += n;
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + sum/_array.length);
    }
}
