import objects.Armor;
import objects.object;

import java.io.Serial;
import java.io.Serializable;

public class Hero implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    String name;
    int lvl;
    object armor;

    Hero(String name, int lvl){
        this.name = name;
        this.lvl = lvl;
        this.armor = new Armor();
    }

    public String getName() {
        return name;
    }

    public int getLvl() {
        return lvl;
    }

    public int getArmor() {
        return armor.getValue();
    }


    public void setName(String name) {
        this.name = name;
    }
}
