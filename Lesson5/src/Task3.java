import objects.Armor;

import java.io.*;

public class Task3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try(FileOutputStream outputStream
                    = new FileOutputStream("Lesson5/saves/save1.bin");
            ObjectOutputStream objectOutputStream
                    = new ObjectOutputStream(outputStream);
            FileInputStream fileInputStream
                    = new FileInputStream("Lesson5/saves/save1.bin");
            ObjectInputStream objectInputStream
                    = new ObjectInputStream(fileInputStream);
            )
        {
            Hero hero = new Hero("Jake", 1);
            hero.setName("Drake");
            objectOutputStream.writeObject(hero);
            hero = (Hero) objectInputStream.readObject();
            System.out.printf("Name: %s lvl: %d", hero.getName(), hero.getLvl());
        }
    }
}
