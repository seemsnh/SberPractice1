import java.io.*;
import java.nio.file.*;
import java.util.Arrays;

public class listNames {
    public static void main(String[] args) throws IOException {
        String str;
        try (BufferedReader reader = Files.newBufferedReader(Paths.get("Lesson5/src/listNames.txt"))) {
            str = reader.readLine();
        }
        String[] names = str.split(", ");
        Arrays.sort(names);
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get("Lesson5/src/listNamesSorted.txt"))) {
            for (String name: names) {
                writer.write(name + '\n');
            }
        }
    }
}
