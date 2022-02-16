import java.util.Scanner;

public class Tsk8 {
    public static void main(String[] args) {

        System.out.println("Что это такое: синий, большой, с усами и полностью набит зайцами?");
        String _ans;
        Scanner _in = new Scanner(System.in);
        boolean _stop = false;
        int _maxAttempts = 3;
        int _attempt = 1;
        while (!_stop){
            _ans = _in.next();
            switch (_ans.toLowerCase()){
                case ("троллейбус") :
                    System.out.println ("Правильно!");
                    _stop = true;
                    break;
                case ("сдаюсь"):
                    System.out.println ("Правильный ответ: троллейбус.");
                    _stop = true;
                    break;
                default:
                    System.out.println("Подумай еще.");
                    if (_attempt >= _maxAttempts){
                        _stop = true;
                    }
                    _attempt++;
            }
        }
    }
}
