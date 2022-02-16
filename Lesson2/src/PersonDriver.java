public class PersonDriver {
    public static void main(String[] args) {
        Phone phone = new Phone("81112223344", "phone model", 999f);
        System.out.println();
        phone.receiveCall("Vasya", "02");
        System.out.println();
        phone.receiveCall("03");
        System.out.println();
        System.out.println(phone.toString());
    }
}
