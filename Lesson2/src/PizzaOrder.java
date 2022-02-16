public class PizzaOrder {
    enum Size{
        SMALL,
        MEDIUM,
        BIG
    }
    private String name;
    private Size size;
    private boolean souse;
    private String address;
    private boolean accepted;

    PizzaOrder(String name, Size size, boolean souse, String address){
        this.name = name;
        this.size = size;
        this.souse = souse;
        this.address = address;
    }

    public void Order(){
        if (accepted){
            System.out.println("Заказ уже принят");
        }
        else{
            System.out.println("Заказ принят. ");
            switch (size) {
                case BIG -> System.out.print("Большая ");
                case MEDIUM -> System.out.print("Средняя ");
                case SMALL -> System.out.print("Маленькая ");
            }
            System.out.printf("пицца «%s» ", name);
            if (souse) System.out.print("с соусом ");
            else System.out.print("без соуса ");
            System.out.printf("на адрес %s", address);
            accepted = true;
        }
    }

    public void Cancel(){
        if (accepted){
            System.out.println("Заказ отменен");
            accepted = false;
        }
        else System.out.println("Нет активных заказов");
    }

    public String getName() {
        return name;
    }

    public Size getSize() {
        return size;
    }

    public String getAddress() {
        return address;
    }
    public boolean getSouse() {
        return souse;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setSouse(boolean souse) {
        this.souse = souse;
    }

    public String toString(){
        String temp = "";
        switch (size) {
            case BIG -> temp += "Большая ";
            case MEDIUM -> temp += "Средняя ";
            case SMALL -> temp += "Маленькая ";
        }
        temp += String.format("пицца «%s» ", name);
        if (souse) temp += "с соусом";
        else temp += "без соуса";
        return temp;
    }
}
