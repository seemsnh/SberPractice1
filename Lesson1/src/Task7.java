import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int[] _fib = new int[11];
        _fib[0] = 0;
        _fib[1] = 1;
        for (int i = 2; i < _fib.length; i++){
            _fib[i] = _fib[i-1] + _fib[i-2];
        }
        System.out.println(Arrays.toString(_fib));
    }
}
