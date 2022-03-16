import java.io.*;

public class Borodino {
    public static void main(String[] args) throws IOException {
        try (BufferedInputStream fileInputStream =
                     new BufferedInputStream(
                             new FileInputStream("Lesson5/src/Borodino.txt"));
             BufferedOutputStream fileOutputStream =
                     new BufferedOutputStream(
                             new FileOutputStream("Lesson5/src/BorodinoRedacted.txt"))) {
            int b;
            int temp = -1;
            while ((b = fileInputStream.read()) != -1) {
                if (b == temp && b == 32){
                    continue;
                }
                fileOutputStream.write(b);
                temp = b;
            }
        }
    }
}
