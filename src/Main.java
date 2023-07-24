import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Şeker Portakalı", 182, "Jose Mauro De Vasconcelos", 1968));
        bookList.add(new Book("Hayvan Çiftliği", 152, "George Orwell", 1945));
        bookList.add(new Book("Beyin", 160, "David Eagleman", 2015));
        bookList.add(new Book("Simyacı", 184, "Paulo Coelho", 1988));
        bookList.add(new Book("Yabancı", 111, "Albert Camus", 1942));
        bookList.add(new Book("Satranç", 77, "Stefan Zweig", 1943));
        bookList.add(new Book("Yeraltından Notlar", 160, "Fyodor Dostoyevski", 1864));
        bookList.add(new Book("Suç ve Ceza", 336, "Fyodor Dostoyevski", 1866));
        bookList.add(new Book("İtiraflarım", 95, "Tolstoy", 1882));
        bookList.add(new Book("Otomatik Portakal", 171, "Anthony Burgess", 1961));

        Map<String, String> bookMap = bookList.stream()
                .collect(Collectors.toMap(Book::getName, Book::getAuthor));

        System.out.println("-- Kitap Listesi--");
        bookMap.forEach((bookName, authorName) -> System.out.println("Kitap Adı: " + bookName + " | Yazarı: " + authorName));

        List<Book> filterList = bookList.stream()
                .filter(book -> book.getPage() > 100)
                .collect(Collectors.toList());

        System.out.println("\n-- 100 Sayfadan Fazla Olan Kitapların Listesi --");
        filterList.forEach(book -> System.out.println("Kitap Adı: " + book.getName() + " | Sayfa Sayısı: " + book.getPage() + " | Yazar: " + book.getAuthor()));
    }
}