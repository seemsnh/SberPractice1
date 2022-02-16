import java.sql.SQLOutput;

public class Phone {
    private String number;
    private String model;
    private float weight;

    Phone(String number, String model, float weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    Phone(String number, String model){
        this.number = number;
        this.model = model;
    }

    Phone(){

    }

    public void receiveCall(String name) {
        System.out.format("Звонит %s", name);
    }

    public void receiveCall(String name, String number) {
        System.out.format("Звонит %s, номер %s", name, number);
    }

    public String getNumber() {
        return number;
    }

    public String toString() {
        return String.format("номер %s, модель %s, вес %f", number, model, weight);
    }
}
