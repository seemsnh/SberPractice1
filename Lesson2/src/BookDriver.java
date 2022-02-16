public class BookDriver {
    public static void main(String[] args) {
        Author pushkin = new Author("Пушкин", "m", "MCCannon@me.com");
        Book book = new Book("OG Пушка: Сбоник стихов", pushkin, 2012);

        System.out.println(book.toString());
        pushkin.setGender("боевой вертолет апачи");
        System.out.println(book.getAuthor().getGender());
    }
}
